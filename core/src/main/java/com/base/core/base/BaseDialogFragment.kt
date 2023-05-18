package com.base.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import kotlin.reflect.KClass

open class BaseDialogFragment <VB : ViewDataBinding, BVM : BaseViewModel<BaseRepository>>(
    layoutId: Int,
    viewModelClass: KClass<BVM>
) : DialogFragment() {
    //protected open val viewModel: BVM by lazy { getViewModel(clazz = viewModelClass) }

    open val binding: VB by lazy {
        DataBindingUtil.inflate(layoutInflater, layoutId, null, false)
    }

    open fun initialize() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding.lifecycleOwner = this
        initialize()
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}