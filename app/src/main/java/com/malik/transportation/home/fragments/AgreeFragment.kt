package com.malik.transportation.home.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAgreeBinding
import com.malik.transportation.databinding.FragmentConfirmationBinding
import com.malik.transportation.home.activity.HomeActivity


class AgreeFragment : Fragment(R.layout.fragment_agree) {
    private var _binding: FragmentAgreeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentAgreeBinding.bind(view)

        binding.agreeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_agreeFragment_to_uniStudentConfirmationFragment)
        }

        binding.disagreeBtn.setOnClickListener {
            findNavController().navigateUp()
        }



    }
}