package com.base.project.ui.fragments.notifications

import com.base.core.base.BaseFragment
import com.base.project.R
import com.base.project.databinding.FragmentNotificationsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>(
    NotificationsViewModel::class.java
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_notifications

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