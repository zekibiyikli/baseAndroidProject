package com.base.project.ui.fragments.home

import com.base.core.base.BaseFragment
import com.base.project.R
import com.base.project.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    HomeViewModel::class.java
) {

    override val getLayoutId: Int
        get() = R.layout.fragment_home

    private val randomImageCollecter= FlowCollector<String> {

    }


    override fun initView() {
        viewModel.getRandomImage()
    }

    override fun initListeners() {
        super.initListeners()
        with(binding){

        }
    }

    override fun initObservers() {
        super.initObservers()
        with(viewModel){
            launch { randomImage.collect(randomImageCollecter) }
        }
    }
}