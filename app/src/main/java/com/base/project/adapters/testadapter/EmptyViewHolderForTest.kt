package com.base.project.adapters.testadapter

import android.content.Context
import com.base.core.base.BaseViewHolder
import com.base.data.models.TestModel
import com.base.project.databinding.ItemTestBinding

class EmptyViewHolderForTest(val binding: ItemTestBinding) :
    BaseViewHolder<TestModel>(binding.root) {
    var model: TestModel? = null
    var onItemClickListener: ((TestModel?) -> Unit?)? = null
    var onItemLongClickListener: ((TestModel?) -> Unit?)? = null
    override fun bind(
        model: TestModel?,
        onItemClickListener: ((TestModel?) -> Unit?)?,
        onItemLongClickListener: ((TestModel?) -> Unit?)?,
        context: Context,
        position: Int
    ) {
        this.model = model
        this.onItemClickListener = onItemClickListener
        this.onItemLongClickListener = onItemLongClickListener
    }
}