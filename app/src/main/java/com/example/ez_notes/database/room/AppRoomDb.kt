package com.example.ez_notes.database.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ez_notes.models.AppNote

@Database(entities = [AppNote::class],version = 1)
abstract class AppRoomDb:RoomDatabase() {
    abstract fun getAppRoomDao(): AppRoomDao

    companion object {
        @Volatile
        private var database:AppRoomDb?=null

        @Synchronized
        fun getInstance(context: Context):AppRoomDb {
            return if (database==null) {
                database = Room.databaseBuilder(context, AppRoomDb::class.java, "database").build()
                database as AppRoomDb
            } else database as AppRoomDb
        }
    }
}