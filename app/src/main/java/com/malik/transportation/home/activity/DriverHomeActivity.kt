package com.malik.transportation.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.R
import com.malik.transportation.databinding.ActivityDriverHomeBinding
import com.malik.transportation.databinding.ActivityHomeBinding

class DriverHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDriverHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityDriverHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}