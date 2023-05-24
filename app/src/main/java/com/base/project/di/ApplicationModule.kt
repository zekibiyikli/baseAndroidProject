package com.base.project.di

import com.base.project.app.BaseApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApplicationModule {
    @Singleton
    @Provides
    fun BaseApp(): BaseApp { return BaseApp() }
}