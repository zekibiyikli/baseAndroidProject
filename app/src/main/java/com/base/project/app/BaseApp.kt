package com.base.project.app

import android.app.Application
import com.base.data.kotpref.KotPref
import com.base.data.room.RoomTestDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application()  {
    val TAG: String = "BaseApp"

    override fun onCreate() {
        super.onCreate()
        app = this
        KotPref().initialize(this)
        RoomTestDatabase.makeDatabase(this)
    }

    companion object {
        private var app: BaseApp? = null
    }
}