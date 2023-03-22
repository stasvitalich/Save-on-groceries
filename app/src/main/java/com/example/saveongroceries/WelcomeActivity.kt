package com.example.saveongroceries

import com.example.saveongroceries.databinding.ActivityWelcomeBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.activity.viewModels

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityWelcomeBinding
    //private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        singInActivity()


        /* super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         openFrag(BlankFragment1.newInstance(), R.id.place_holder)
         openFrag(BlankFragment2.newInstance(), R.id.place_holder2)
         dataModel.messageForActivity.observe(this) {
             binding.textView.text = it
         }*/
    }

    private fun singInActivity(){
        binding.loginButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.place_holder, BlankFragment1.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }


}
