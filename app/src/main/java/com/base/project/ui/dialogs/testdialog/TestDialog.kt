package com.base.project.ui.dialogs.testdialog

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.base.core.base.BaseDialogFragment
import com.base.core.defaults.DefaultViewModel
import com.base.project.R
import com.base.project.databinding.DialogTestBinding

class TestDialog : BaseDialogFragment<DialogTestBinding, DefaultViewModel>(
    R.layout.dialog_test,
    DefaultViewModel::class
) {
    private var listener: ((gender: String) -> Unit?)? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
    }

    fun addDismissListener(function: (gender: String) -> Unit): TestDialog {
        this.listener = function
        return this
    }

}