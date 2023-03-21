package com.example.saveongroceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}