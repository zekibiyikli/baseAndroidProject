package com.base.core.base

import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass

abstract class BaseViewModel<out REPO : BaseRepository>(repoType: KClass<REPO>) : ViewModel() {

}