package com.base.project.di

import com.base.project.ui.fragments.dashboard.DashboardFragment
import com.base.project.ui.fragments.home.HomeFragment
import com.base.project.ui.fragments.notifications.NotificationsFragment
import com.base.project.ui.fragments.testfragment.TestFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@InstallIn(FragmentComponent::class)
@Module
object FragmentModule {
    @FragmentScoped
    @Provides
    fun TestFragment(): TestFragment { return TestFragment() }
    @FragmentScoped
    @Provides
    fun DashboardFragment(): DashboardFragment { return DashboardFragment() }
    @FragmentScoped
    @Provides
    fun HomeFragment(): HomeFragment { return HomeFragment() }
    @FragmentScoped
    @Provides
    fun NotificationsFragment(): NotificationsFragment { return NotificationsFragment() }

}