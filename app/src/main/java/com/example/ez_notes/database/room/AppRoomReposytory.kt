package com.example.ez_notes.database.room

import androidx.lifecycle.LiveData
import com.example.ez_notes.database.DbRepository
import com.example.ez_notes.models.AppNote

class AppRoomReposytory(private val appRoomdao: AppRoomDao): DbRepository {
    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomdao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomdao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomdao.delete(note)
    }
}