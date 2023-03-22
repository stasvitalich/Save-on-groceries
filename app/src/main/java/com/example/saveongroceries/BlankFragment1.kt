package com.example.saveongroceries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saveongroceries.databinding.FragmentBlank1Binding
import com.example.saveongroceries.BlankFragment3

class BlankFragment1 : Fragment() {


    lateinit var binding: FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.singInButton?.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            if (transaction != null) {
                transaction.replace(R.id.place_holder2, BlankFragment3())
            }
            if (transaction != null) {
                transaction.disallowAddToBackStack()
            }
            if (transaction != null) {
                transaction.commit()
            }
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment1()
    }
}