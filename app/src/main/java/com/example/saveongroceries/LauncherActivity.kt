package com.example.saveongroceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import com.example.saveongroceries.databinding.ActivityLauncherBinding
import render.animations.*


class LauncherActivity : AppCompatActivity() {
    lateinit var binding: ActivityLauncherBinding
    private val SPLASH_TIME_OUT:Long=4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            openFrag(BlankFragment1.newInstance(), R.id.place_holder)
        }, SPLASH_TIME_OUT)
    }

    private fun openFrag (f: Fragment, idHolder: Int){
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .addToBackStack(null)
            .commit()
    }
}