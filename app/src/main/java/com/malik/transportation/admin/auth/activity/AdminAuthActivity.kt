package com.malik.transportation.admin.auth.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.databinding.ActivityAdminAuthBinding
import com.malik.transportation.databinding.ActivityAuthBinding

class AdminAuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityAdminAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}