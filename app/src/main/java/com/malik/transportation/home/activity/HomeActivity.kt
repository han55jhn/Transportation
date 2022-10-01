package com.malik.transportation.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.R
import com.malik.transportation.databinding.ActivityAuthBinding
import com.malik.transportation.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}