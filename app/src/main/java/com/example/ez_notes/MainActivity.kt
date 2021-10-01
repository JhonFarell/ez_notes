package com.example.ez_notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ez_notes.databinding.ActivityMainBinding
import com.example.ez_notes.utilits.constances.APP_ACTIVITY

class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: Toolbar
    lateinit var navController: NavController
    private var binding: ActivityMainBinding? = null
    val mBinding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        APP_ACTIVITY = this
        mToolbar = mBinding.toolbar
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
        title = getString(R.string.notes)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}