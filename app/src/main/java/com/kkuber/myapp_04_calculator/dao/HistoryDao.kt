package com.kkuber.myapp_04_calculator.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.kkuber.myapp_04_calculator.model.History

@Dao
interface HistoryDao {

    @Query(value = "SELECT * FROM history")
    fun getAll() : List<History>

    @Insert
    fun insertHistory(history : History)

    @Query(value = "DELETE FROM history")
    fun deleteAll()

//    @Delete
//    fun delete(history: History)
//
//    @Query(value = "SELECT * FROM history WRERE result LIKE :result")
//    fun findByResult(result : String) : List<History>


}