package com.base.project.app

import android.app.Application
import com.base.data.kotpref.KotPref

class BaseApp : Application()  {
    val TAG: String = "BaseApp"

    override fun onCreate() {
        super.onCreate()
        app = this
        KotPref().initialize(this)
    }

    companion object {
        private var app: BaseApp? = null
    }
}