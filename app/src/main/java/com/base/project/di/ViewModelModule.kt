package com.base.project.di

import com.base.project.ui.fragments.dashboard.DashboardViewModel
import com.base.project.ui.fragments.home.HomeViewModel
import com.base.project.ui.fragments.notifications.NotificationsViewModel
import com.base.project.ui.fragments.testfragment.TestViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {
    @Provides
    @Singleton
    fun TestViewModel():TestViewModel { return TestViewModel() }
    @Provides
    @Singleton
    fun DashboardViewModel():DashboardViewModel { return DashboardViewModel() }
    @Provides
    @Singleton
    fun HomeViewModel():HomeViewModel { return HomeViewModel() }
    @Provides
    @Singleton
    fun NotificationsViewModel():NotificationsViewModel {return NotificationsViewModel() }

}