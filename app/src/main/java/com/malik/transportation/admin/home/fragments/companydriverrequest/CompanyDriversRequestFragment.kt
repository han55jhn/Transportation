package com.malik.transportation.admin.home.fragments.companydriverrequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.CompanyDriverRequestAdapter
import com.malik.transportation.admin.home.adapters.DriverRequestAdapter
import com.malik.transportation.databinding.FragmentCompanyDriversRequestBinding
import com.malik.transportation.databinding.FragmentDriversRequestsBinding


class CompanyDriversRequestFragment : Fragment(R.layout.fragment_company_drivers_request), CompanyDriverRequestAdapter.OnItemClickListener {
    private var _binding: FragmentCompanyDriversRequestBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: CompanyDriverRequestAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentCompanyDriversRequestBinding.bind(view)

        mAdapter = CompanyDriverRequestAdapter(
            requireContext(),
            this
        )
        binding.companyDriverRequestRv.layoutManager = LinearLayoutManager(requireContext())
        binding.companyDriverRequestRv.adapter = mAdapter

    }

    override fun onCardClick(position: Int) {
        findNavController().navigate(R.id.action_companyDriversRequestFragment_to_companyDriverRequestDetailFragment)

    }
}