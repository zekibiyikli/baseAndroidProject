package com.base.project.app

import android.app.Application

class BaseApp : Application()  {
    val TAG: String = "BaseApp"

    override fun onCreate() {
        super.onCreate()
        app = this
    }

    companion object {
        private var app: BaseApp? = null
    }
}