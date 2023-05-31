package com.base.project.ui.fragments.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.base.core.base.BaseViewModel
import com.base.core.defaults.DefaultRepo
import com.base.data.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotificationsViewModel
@Inject
constructor(): BaseViewModel<MainRepo>(DefaultRepo::class) {


}