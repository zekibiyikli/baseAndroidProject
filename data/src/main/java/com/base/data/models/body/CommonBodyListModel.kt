package com.base.data.models.body

import com.base.data.base.BaseResponse


open class CommonBodyListModel<MODEL>(
    val message: List<MODEL>? = null
) : BaseResponse()
