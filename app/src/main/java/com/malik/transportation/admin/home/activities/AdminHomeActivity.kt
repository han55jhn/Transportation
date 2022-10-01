package com.malik.transportation.admin.home.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.databinding.ActivityAdminAuthBinding
import com.malik.transportation.databinding.ActivityAdminHomeBinding

class AdminHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityAdminHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}