package com.base.core.base

import android.graphics.Camera
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.base.core.R
import kotlin.reflect.KClass

abstract class BaseActivity<VB : ViewDataBinding, BVM : BaseViewModel<BaseRepository>>(
    viewModelClass: KClass<BVM>
) : AppCompatActivity() {

    protected open val binding: VB by lazy {
        DataBindingUtil.setContentView(this, getLayoutId)
    }

    abstract val getLayoutId: Int

    open fun initialize() {}

    abstract fun initView()

    @CallSuper
    open fun initListeners() {
        //callSuperClass
    }

    @CallSuper
    open fun initObservers() {
        //callSuperClass
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
        initListeners()
        initObservers()
    }


}
