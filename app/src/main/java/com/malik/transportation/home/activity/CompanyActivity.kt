package com.malik.transportation.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.databinding.ActivityCompanyBinding
import com.malik.transportation.databinding.ActivityDriverHomeBinding

class CompanyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCompanyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}