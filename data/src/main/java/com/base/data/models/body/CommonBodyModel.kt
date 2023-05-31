package com.base.data.models.body

import com.base.data.base.BaseResponse


open  class CommonBodyModel<MODEL>(
    val message:MODEL?=null,
): BaseResponse()
