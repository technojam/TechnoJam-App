package com.sarthak.technojam.ui.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sarthak.technojam.R
import com.sarthak.technojam.databinding.ActivitySplashBinding

/** Activity for displaying the splash screen. */
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var viewModel: SpashScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        viewModel = ViewModelProvider(this).get(SpashScreenViewModel::class.java)
    }
}
