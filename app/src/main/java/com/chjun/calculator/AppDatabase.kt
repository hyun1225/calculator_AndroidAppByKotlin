package com.chjun.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chjun.calculator.dao.HistoryDao
import com.chjun.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase:RoomDatabase(){
    abstract fun historyDao(): HistoryDao
}