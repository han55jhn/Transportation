package com.malik.transportation.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.databinding.ActivityHomeBinding
import com.malik.transportation.databinding.ActivityParentsHomeBinding

class ParentsHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParentsHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityParentsHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}