package com.example.ez_notes.screens.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.ez_notes.R
import com.example.ez_notes.databinding.FragmentMainBinding
import com.example.ez_notes.screens.start.Start_ViewModel
import com.example.ez_notes.utilits.constances.APP_ACTIVITY

class Main_Fragment : Fragment() {

    private var binding:FragmentMainBinding?=null
    private val mBinding get() = binding!!
    private lateinit var mViewModel: Start_ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization () {
    mViewModel = ViewModelProvider (this).get(Start_ViewModel::class.java)
        mBinding.addNoteBtn.setOnClickListener{
            APP_ACTIVITY.navController.navigate(R.id.action_main_Fragment_to_addNewNote_Fragment)
        }
    }
}