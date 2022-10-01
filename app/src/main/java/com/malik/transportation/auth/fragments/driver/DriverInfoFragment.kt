package com.malik.transportation.auth.fragments.driver

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverInfoBinding


class DriverInfoFragment : Fragment(R.layout.fragment_driver_info) {
    private var _binding: FragmentDriverInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverInfoBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener {

                findNavController().navigate(R.id.action_driverInfoFragment_to_driverVehicleFragment)
            }

        }

    }
}