package com.base.project.ui.fragments.dashboard

import com.base.core.base.BaseFragment
import com.base.project.R
import com.base.project.databinding.FragmentDashboardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>(
    DashboardViewModel::class.java
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_dashboard

    override fun initView() {

    }

    override fun initListeners() {
        super.initListeners()
        with(binding){

        }
    }

    override fun initObservers() {
        super.initObservers()
        with(viewModel){

        }
    }
}