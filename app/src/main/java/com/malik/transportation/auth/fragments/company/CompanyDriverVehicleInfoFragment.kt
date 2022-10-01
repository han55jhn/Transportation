package com.malik.transportation.auth.fragments.company

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentCompanyDriverInfoBinding
import com.malik.transportation.databinding.FragmentCompanyDriverVehicleInfoBinding
import androidx.navigation.fragment.findNavController


class CompanyDriverVehicleInfoFragment : Fragment(R.layout.fragment_company_driver_vehicle_info) {
    private var _binding: FragmentCompanyDriverVehicleInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyDriverVehicleInfoBinding.bind(view)
        binding.apply {
            vehicleRegistrationBtn.setOnClickListener {

                findNavController().navigate(R.id.action_companyDriverVehicleInfoFragment2_to_companyHomeFragment)
            }

        }

    }
}