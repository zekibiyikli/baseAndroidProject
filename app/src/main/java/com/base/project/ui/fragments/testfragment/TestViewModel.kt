package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseViewModel
import com.base.data.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel
    @Inject
    constructor(): BaseViewModel<MainRepo>(MainRepo::class) {

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