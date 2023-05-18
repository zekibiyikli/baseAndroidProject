package com.base.project.ui.fragments.testfragment

import com.base.core.base.BaseFragment
import com.base.project.R
import com.base.project.databinding.FragmentTestBinding

class TestFragment : BaseFragment<FragmentTestBinding, TestViewModel>(
    TestViewModel::class
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_test

    override fun initView() {

    }

    override fun initListeners() {
        super.initListeners()
    }

    override fun initObservers() {
        super.initObservers()
    }

    companion object {

    }
}