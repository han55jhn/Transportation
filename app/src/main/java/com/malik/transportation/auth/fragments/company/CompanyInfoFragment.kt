package com.malik.transportation.auth.fragments.company

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentCompanyInfoBinding
import com.malik.transportation.databinding.FragmentDriverInfoBinding


class CompanyInfoFragment : Fragment(R.layout.fragment_company_info) {
    private var _binding: FragmentCompanyInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyInfoBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener {

                findNavController().navigate(R.id.action_companyInfoFragment_to_companyInfoConfirmationFragment)
            }

        }

    }
}