package com.example.ez_notes.utilits

import com.example.ez_notes.MainActivity
import com.example.ez_notes.database.DbRepository

object constances {
    lateinit var APP_ACTIVITY: MainActivity
    lateinit var REPOSITORY:DbRepository
    const val DB_TYPE = "type_database"
    const val TYPE_ROOM = "type_room"
}