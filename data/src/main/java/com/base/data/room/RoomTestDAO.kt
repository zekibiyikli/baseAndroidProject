package com.base.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.base.data.room.models.RoomTestModel

@Dao
interface RoomTestDAO {

    @Insert
    fun insertAll(vararg users: RoomTestModel):List<Long>

    @Query("SELECT * FROM roomtestmodel")
    fun getAllUsers():List<RoomTestModel>

    @Query("SELECT * FROM roomtestmodel WHERE id=:id")
    fun getUser(id:Int): RoomTestModel

    @Query("DELETE FROM roomtestmodel")
    fun deleteAllCountries()
}