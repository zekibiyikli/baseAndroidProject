package com.base.data.room

import android.content.Context
import androidx.room.*
import com.base.data.room.models.RoomTestModel

@Database(entities = arrayOf(RoomTestModel::class), version = 1)
abstract class RoomTestDatabase : RoomDatabase(){

    abstract fun roomTestDAO():RoomTestDAO

    companion object{
        var instance:RoomTestDatabase?=null

        fun makeDatabase(context: Context) {
            if (instance==null){
                instance=Room.databaseBuilder(context, RoomTestDatabase::class.java, "roomtestdatabase").allowMainThreadQueries().build()
            }
        }

    }
}