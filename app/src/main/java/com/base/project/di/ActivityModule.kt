package com.base.project.di

import com.base.project.ui.activities.splash.SplashActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@InstallIn(ActivityRetainedComponent::class)
@Module
class ActivityModule {
    @ActivityRetainedScoped
    @Provides
    fun SplashActivity(): SplashActivity { return SplashActivity() }
}