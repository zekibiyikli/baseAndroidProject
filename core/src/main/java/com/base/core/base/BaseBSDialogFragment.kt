package com.base.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.*
import kotlin.reflect.KClass

//Bottom Sheet Dialog Fragment
open class BaseBSDialogFragment <VB : ViewBinding, BVM : BaseViewModel<BaseRepository>>(
    layoutId: Int,
    viewModelClass: KClass<BVM>
) : BottomSheetDialogFragment() {
    //protected open val viewModel: BVM by lazy { getViewModel(clazz = viewModelClass) }

    open val binding: VB by lazy {
        DataBindingUtil.inflate(layoutInflater, layoutId, null, false)
    }

    open fun initialize() {}

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    protected open fun viewBinding(action: VB.() -> Unit) {
        action(binding)
    }

    protected open fun viewModel(action: BVM.() -> Unit) {
        //action(viewModel)
    }

}