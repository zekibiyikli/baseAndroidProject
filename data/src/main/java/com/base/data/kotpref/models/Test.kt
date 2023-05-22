package com.base.data.kotpref.models

import com.chibatching.kotpref.KotprefModel
import java.util.*

object Test : KotprefModel() {
    var name by stringPref()
    var code by nullableStringPref()
    var age by intPref(default = 14)
    var highScore by longPref()
    var rate by floatPref()
    val prizes by stringSetPref {
        val set = TreeSet<String>()
        set.add("Beginner")
        return@stringSetPref set
    }
}