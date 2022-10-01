package com.malik.transportation.auth.fragments.driver

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverVehicleBinding
import com.malik.transportation.home.activity.DriverHomeActivity


class DriverVehicleFragment : Fragment(R.layout.fragment_driver_vehicle) {
    private var _binding: FragmentDriverVehicleBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverVehicleBinding.bind(view)

        binding.apply {
            nextBtn.setOnClickListener {
                val intent = Intent(requireContext(), DriverHomeActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
        }

    }
}