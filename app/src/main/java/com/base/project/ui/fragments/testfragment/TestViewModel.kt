package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseViewModel
import com.base.data.repository.MainRepo
import kotlinx.coroutines.launch

class TestViewModel : BaseViewModel<MainRepo>(MainRepo::class) {

    fun testCoroutine(){
        launch {
            // Work on async
        }
    }
}