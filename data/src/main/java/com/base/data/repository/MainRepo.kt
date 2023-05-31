package com.base.data.repository

import com.base.data.base.BaseRepository
import com.base.data.models.response.HoundImagesResponse
import com.base.data.models.response.HoundListResponse
import com.base.data.models.response.ListAllResponse
import com.base.data.models.response.RandomImageResponse
import com.base.data.network.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepo
    @Inject
    constructor(private val apiService: ApiService) : BaseRepository() {
        suspend fun listAll(): ListAllResponse = apiService.listAll()
        suspend fun randomImage(): RandomImageResponse = apiService.randomImage()
        suspend fun houndImages(): HoundImagesResponse = apiService.houndImages()
        suspend fun houndList(): HoundListResponse = apiService.houndList()
}