package com.base.data.base

import com.google.gson.annotations.SerializedName

open class BaseResponse(
    @SerializedName("status")
    val status: String?=null
)