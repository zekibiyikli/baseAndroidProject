package com.base.data.repository

import com.base.core.base.BaseRepository
import com.base.data.network.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepo
    @Inject
    constructor(private val apiService: ApiService) : BaseRepository() {

    }