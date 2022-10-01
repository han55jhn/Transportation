package com.malik.transportation.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malik.transportation.databinding.ActivityHomeBinding
import com.malik.transportation.databinding.ActivityStudentHomeBinding

class StudentHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStudentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityStudentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}