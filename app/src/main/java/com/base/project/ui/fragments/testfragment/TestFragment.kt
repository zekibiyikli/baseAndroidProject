package com.base.project.ui.fragments.testfragment

import androidx.lifecycle.Observer
import com.base.core.base.BaseFragment
import com.base.project.R
import com.base.project.databinding.FragmentTestBinding
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.launch

class TestFragment : BaseFragment<FragmentTestBinding, TestViewModel>(
    TestViewModel::class
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_test

    private val flowCollecter= FlowCollector<String> {

    }

    override fun initView() {

    }

    override fun initListeners() {
        super.initListeners()
    }

    override fun initObservers() {
        super.initObservers()
        with(viewModel){
            launch {
                stateFlow.collect(flowCollecter)
            }
        }
    }

    companion object {

    }
}