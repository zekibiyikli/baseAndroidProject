package com.base.data.repository

import com.base.core.base.BaseRepository
import com.base.data.network.ApiService

class MainRepo(private val apiService: ApiService) : BaseRepository() {}