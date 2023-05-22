package com.base.data.room.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoomTestModel(
    @ColumnInfo(name="name")
    var name:String?,
    @ColumnInfo(name="age")
    var age:Int?
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}