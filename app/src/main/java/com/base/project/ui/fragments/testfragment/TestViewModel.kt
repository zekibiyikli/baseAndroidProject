package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseViewModel
import com.base.data.repository.MainRepo
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class TestViewModel : BaseViewModel<MainRepo>(MainRepo::class) {

    fun testCoroutineAndFlow(){
        launch {

        }
    }

    private val _stateFlow= MutableStateFlow("kotlinStateFlow")
    val stateFlow=_stateFlow.asStateFlow()
    fun testStateFlow(){
        _stateFlow.value="State Flow"
    }

}