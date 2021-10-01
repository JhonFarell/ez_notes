package com.example.ez_notes.database

import androidx.lifecycle.LiveData
import com.example.ez_notes.models.AppNote

interface DbRepository {
    val allNotes: LiveData<List<AppNote>>
    suspend fun insert (note: AppNote, onSuccess:()->Unit)
    suspend fun delete (note: AppNote, onSuccess:()->Unit)
}