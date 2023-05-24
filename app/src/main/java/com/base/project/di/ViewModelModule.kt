package com.base.project.di

import com.base.project.ui.fragments.testfragment.TestViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
class ViewModelModule {
    @ViewModelScoped
    @Provides
    fun TestViewModel():TestViewModel { return TestViewModel() }
}