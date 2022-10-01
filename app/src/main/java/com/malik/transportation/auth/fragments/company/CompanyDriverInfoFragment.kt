package com.malik.transportation.auth.fragments.company

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentCompanyDriverInfoBinding
import com.malik.transportation.databinding.FragmentCompanyInfoBinding
import com.malik.transportation.databinding.FragmentDriverInfoBinding


class CompanyDriverInfoFragment : Fragment(R.layout.fragment_company_driver_info) {
    private var _binding: FragmentCompanyDriverInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyDriverInfoBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener {

                findNavController().navigate(R.id.action_companyDriverInfoFragment2_to_companyDriverVehicleInfoFragment2)
            }

        }

    }
}