package com.base.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.base.data.base.BaseRepository
import kotlin.reflect.KClass

abstract class BaseFragment<VB : ViewDataBinding, out BVM : BaseViewModel<BaseRepository>>(
    viewModelClass: Class<BVM>
) : Fragment() {

    abstract val getLayoutId: Int

    protected open val viewModel: BVM by lazy{
        ViewModelProvider(requireActivity()).get(viewModelClass)
    }

    open val binding: VB by lazy {
        DataBindingUtil.inflate(layoutInflater, getLayoutId, null, false)
    }

    open fun initialize() {}

    abstract fun initView()

    @CallSuper
    open fun initListeners() {
        /*do nothing*/
    }

    @CallSuper
    open fun initObservers() {
        /*do nothing*/
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding.lifecycleOwner = this
        initialize()
        return binding.root
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
        initListeners()
        initObservers()
    }
}