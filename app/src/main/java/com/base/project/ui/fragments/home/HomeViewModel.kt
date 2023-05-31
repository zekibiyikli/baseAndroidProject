package com.base.project.ui.fragments.home

import com.base.core.base.BaseViewModel
import com.base.core.defaults.DefaultRepo
import com.base.data.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel // Bunu kaldırınca çalışıyor
class HomeViewModel
@Inject constructor(): BaseViewModel<MainRepo>(DefaultRepo::class) {

    private val _randomImage = MutableStateFlow("")
    val randomImage=_randomImage.asStateFlow()
    fun getRandomImage(){
        sendRequest {
            api.randomImage().apply {
                message?.let {
                    _randomImage.value=it
                }
            }
        }
    }

}