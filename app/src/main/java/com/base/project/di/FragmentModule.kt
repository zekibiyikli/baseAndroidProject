package com.base.project.di

import com.base.project.ui.fragments.testfragment.TestFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@InstallIn(FragmentComponent::class)
@Module
class FragmentModule {
    @FragmentScoped
    @Provides
    fun TestFragment(): TestFragment { return TestFragment() }
}