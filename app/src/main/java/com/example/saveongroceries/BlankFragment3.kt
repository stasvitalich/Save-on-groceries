package com.example.saveongroceries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saveongroceries.databinding.FragmentBlank3Binding
class BlankFragment3 : Fragment() {

    lateinit var binding: FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank3Binding.inflate(inflater)
        return binding.root
    }



    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment1()
    }
}