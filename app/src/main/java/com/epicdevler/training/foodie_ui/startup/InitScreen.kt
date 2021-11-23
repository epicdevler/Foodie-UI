package com.epicdevler.training.foodie_ui.startup

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.epicdevler.training.foodie_ui.R
import com.epicdevler.training.foodie_ui.R.color.orange
import com.epicdevler.training.foodie_ui.databinding.InitScreenActivityLayoutBinding

@SuppressLint("CustomSplashScreen")
class InitScreen : AppCompatActivity() {

    lateinit var binding : InitScreenActivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InitScreenActivityLayoutBinding.inflate(layoutInflater)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.statusBarColor = resources.getColor(orange, null)
        }

        setContentView(binding.root)

    }



}