package com.example.ez_notes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.ez_notes.database.room.AppRoomDao
import com.example.ez_notes.database.room.AppRoomDb
import com.example.ez_notes.database.room.AppRoomReposytory
import com.example.ez_notes.utilits.constances.REPOSITORY
import com.example.ez_notes.utilits.constances.TYPE_ROOM

class Start_ViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application

    fun initDB(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDb.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomReposytory(dao)
                onSuccess()

            }

        }

    }
}