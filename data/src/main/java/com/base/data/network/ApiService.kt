package com.base.data.network

import com.base.data.models.response.HoundImagesResponse
import com.base.data.models.response.HoundListResponse
import com.base.data.models.response.ListAllResponse
import com.base.data.models.response.RandomImageResponse
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.http.GET

interface ApiService {

    @GET("list/all")
    suspend fun listAll(): ListAllResponse

    @GET("image/random")
    suspend fun randomImage(): RandomImageResponse

    @GET("hound/images")
    suspend fun houndImages(): HoundImagesResponse

    @GET("hound/list")
    suspend fun houndList(): HoundListResponse

}
