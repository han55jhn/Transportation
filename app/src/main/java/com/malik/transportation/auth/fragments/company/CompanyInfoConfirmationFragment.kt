package com.malik.transportation.auth.fragments.company

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
import com.malik.transportation.databinding.FragmentCompanyInfoConfirmationBinding
import com.malik.transportation.databinding.FragmentVehicleConfirmationBinding
import com.malik.transportation.home.activity.CompanyActivity
import com.malik.transportation.home.activity.ParentsHomeActivity


class CompanyInfoConfirmationFragment : Fragment(R.layout.fragment_company_info_confirmation) {
    private var _binding: FragmentCompanyInfoConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyInfoConfirmationBinding.bind(view)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(requireContext(), CompanyActivity::class.java)
            startActivity(intent)
            requireActivity().finish()

        }, 2000)

    }
}