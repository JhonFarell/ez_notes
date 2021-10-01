package com.example.ez_notes.screens.add_new_note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.ez_notes.R
import com.example.ez_notes.databinding.FragmentAddNewNoteBinding
import com.example.ez_notes.utilits.toastFactory

class AddNewNote_Fragment : Fragment() {

    private var binding: FragmentAddNewNoteBinding? = null
    private val mBinding get() = binding!!
    private lateinit var mViewModel: AddNewNote_ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddNewNoteBinding.inflate(layoutInflater, container, false)
        return mBinding.root
        mBinding.addNoteBtn.setOnClickListener{
            var nameCheck: Boolean = mBinding.enterNoteName.text.toString().isEmpty()
            if (!nameCheck) {
                toastFactory(getString(R.string.toastEnterName))
            }
        }
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
        mViewModel = ViewModelProvider(this).get(AddNewNote_ViewModel::class.java)
    }

}