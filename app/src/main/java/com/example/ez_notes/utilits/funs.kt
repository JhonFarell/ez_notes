package com.example.ez_notes.utilits

import android.content.Context
import android.view.Gravity
import android.widget.Toast
import com.example.ez_notes.utilits.constances.APP_ACTIVITY

fun toastFactory (message: String) {
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}