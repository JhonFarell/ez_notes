package com.example.ez_notes.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.ez_notes.R
import com.example.ez_notes.databinding.FragmentStratAppBinding
import com.example.ez_notes.utilits.constances.APP_ACTIVITY
import com.example.ez_notes.utilits.constances.TYPE_ROOM

class StratApp_Fragment : Fragment() {

    private var binding: FragmentStratAppBinding? = null
    private val mBinding get() = binding!!
    private lateinit var mViewModel: Start_ViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStratAppBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun initialization() {
        mViewModel = ViewModelProvider (this).get(Start_ViewModel::class.java)
        binding?.roomBtn?.setOnClickListener {
            mViewModel.initDB(TYPE_ROOM){
                APP_ACTIVITY.navController.navigate(R.id.action_stratApp_Fragment_to_main_Fragment2)
            }
        }
    }
}