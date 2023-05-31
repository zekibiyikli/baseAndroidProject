package com.base.data.models

import com.base.data.base.BaseModel


data class TestModel(
    var text:String="",
    var isSelect:Boolean=false
) : BaseModel()
