package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseFragment
import com.base.data.room.RoomTestDatabase
import com.base.project.R
import com.base.project.databinding.FragmentTestBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TestFragment : BaseFragment<FragmentTestBinding, TestViewModel>(
    TestViewModel::class.java
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_test

    private val flowCollecter= FlowCollector<String> {

    }
    private val randomImageCollecter= FlowCollector<String> {

    }

    override fun initView() {
        viewModel.getRandomImage()
    }

    override fun initListeners() {
        super.initListeners()
    }

    override fun initObservers() {
        super.initObservers()
        with(viewModel){
            launch { randomImage.collect(randomImageCollecter) }
            launch { stateFlow.collect(flowCollecter) }
        }
    }

    private fun exampleRoom(){
        val dao= RoomTestDatabase.instance?.roomTestDAO()
        dao?.let {

        }
    }

    companion object {

    }
}