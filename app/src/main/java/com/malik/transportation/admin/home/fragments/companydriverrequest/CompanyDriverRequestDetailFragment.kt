package com.malik.transportation.admin.home.fragments.companydriverrequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentCompanyDriverRequestDetailBinding
import com.malik.transportation.databinding.FragmentDriverRequestDetailBinding


class CompanyDriverRequestDetailFragment : Fragment(R.layout.fragment_company_driver_request_detail) {
    private var _binding: FragmentCompanyDriverRequestDetailBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyDriverRequestDetailBinding.bind(view)


    }

}