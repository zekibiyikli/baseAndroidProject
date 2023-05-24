package com.base.project.ui.activities.splash

import android.annotation.SuppressLint
import com.base.core.base.BaseActivity
import com.base.core.defaults.DefaultViewModel
import com.base.project.R
import com.base.project.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<ActivitySplashBinding, DefaultViewModel>(
    DefaultViewModel::class
) {
    override val getLayoutId: Int
        get() = R.layout.activity_splash

    val TAG: String = "SplashActivity"

    override fun initView() {

    }
}