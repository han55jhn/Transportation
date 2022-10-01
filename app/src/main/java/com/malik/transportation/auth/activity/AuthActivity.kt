package com.malik.transportation.auth.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.R
import com.malik.transportation.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}