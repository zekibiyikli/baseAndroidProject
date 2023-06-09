package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseViewModel
import com.base.core.defaults.DefaultRepo
import com.base.data.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel
    @Inject
    constructor(): BaseViewModel<MainRepo>(DefaultRepo::class) {

    fun testCoroutineAndFlow(){
        launch {

        }
    }

    private val _stateFlow= MutableStateFlow("kotlinStateFlow")
    val stateFlow=_stateFlow.asStateFlow()
    fun testStateFlow(){
        _stateFlow.value="State Flow"
    }

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