package com.malik.transportation.admin.home.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAdminHomeBinding
import com.malik.transportation.databinding.FragmentAdminLoginBinding


class AdminHomeFragment : Fragment(R.layout.fragment_admin_home) {
    private var _binding: FragmentAdminHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentAdminHomeBinding.bind(view)


        binding.educationalInstitutionCard.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_institutionRequestsFragment)

        }
        binding.vehicleRequestCard.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_vehicleRequestFragment)

        }

        binding.driverRequestCard.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_driversRequestsFragment)

        }
        binding.studentRequestCard.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_studentsRequestsFragment)

        }

        binding.companyDriverRequestCard.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_companyDriversRequestFragment)

        }

    }
}