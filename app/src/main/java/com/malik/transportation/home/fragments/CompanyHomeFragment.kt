package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentCompanyHomeBinding
import com.malik.transportation.databinding.FragmentDriverHomeBinding
import com.malik.transportation.home.adapter.DriverOrderAdapter
import com.malik.transportation.home.adapter.StudentRequestsAdapter


class CompanyHomeFragment : Fragment(R.layout.fragment_company_home) {
    private var _binding: FragmentCompanyHomeBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: StudentRequestsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyHomeBinding.bind(view)

        mAdapter = StudentRequestsAdapter(
            requireContext()
        )

        binding.addDriverTv.setOnClickListener {
            findNavController().navigate(R.id.action_companyHomeFragment_to_companyDriverInfoFragment2)
        }

        binding.studentTeacherRv.layoutManager = LinearLayoutManager(requireContext())
        binding.studentTeacherRv.adapter = mAdapter
    }
}