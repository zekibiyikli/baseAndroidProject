package com.base.data.models

import com.base.core.base.BaseModel

data class TestModel(
    var text:String="",
    var isSelect:Boolean=false
) : BaseModel()
