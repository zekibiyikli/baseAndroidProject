package com.base.project.adapters.testadapter

import android.content.Context
import com.base.core.base.BaseAdapter
import com.base.data.models.TestModel
import com.base.project.databinding.ItemTestBinding

class EmptyAdapterForTest (
    private var allStoriesList: MutableList<TestModel>,
    onItemClickListener: ((model: TestModel?) -> Unit)? = null,
    onItemLongClickListener: ((model: TestModel?) -> Unit)? = null,
    val context: Context
) : BaseAdapter<TestModel, ItemTestBinding, EmptyViewHolderForTest>(
    ItemTestBinding::class,
    EmptyViewHolderForTest::class,
    allStoriesList,
    onItemClickListener,
    onItemLongClickListener,
    context
) {
    override fun onBindViewHolder(holder: EmptyViewHolderForTest, position: Int) {
        super.onBindViewHolder(holder, position)

    }

}