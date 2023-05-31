package com.base.core.base

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.base.core.defaults.DefaultRepo
import com.base.data.base.BaseRepository
import com.base.data.models.ErrorDataModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import retrofit2.HttpException
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext
import kotlin.reflect.KClass

abstract class BaseViewModel<out REPO : BaseRepository>(kClass: KClass<DefaultRepo>) : ViewModel(),CoroutineScope {
    @Inject
    lateinit var api: @UnsafeVariance REPO
    val showProgress: MutableLiveData<Boolean> = MutableLiveData()
    val generalError: MutableLiveData<ErrorDataModel> = MutableLiveData()

    var TAG="BaseViewModel"

    private val job= Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    val coroutineExceptionHandler: CoroutineExceptionHandler? = try {
        CoroutineExceptionHandler { _, throwable ->
            if (throwable is HttpException) {
                val data: String? = throwable.response()?.errorBody()?.string()
                data?.let {
                    val type = object : TypeToken<ErrorDataModel>() {}.rawType
                    val obj: ErrorDataModel? = Gson().fromJson<ErrorDataModel>(data, type)
                    generalError.postValue(obj)
                }
            }
            Log.d(TAG, "ERROR_${throwable.message}", throwable)
        }
    } catch (e: Exception) {
        Log.e("{$TAG}_ERROR_CoroutineExceptionHandler:", e.message.toString())
        null
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }

    inline fun sendRequest(
        crossinline block: suspend CoroutineScope.() -> Unit
    ) {
        if (coroutineExceptionHandler != null) {
            launch(coroutineExceptionHandler!!) {
                showProgress.postValue(true)
                try {
                    block()
                } finally {
                    showProgress.postValue(false)
                }
            }
        } else {
            val model = ErrorDataModel("Error", "Message", 403)
            generalError.postValue(model)
        }
    }

}