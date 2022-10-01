package com.malik.transportation.admin.home.fragments.driverrequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.DriverRequestAdapter
import com.malik.transportation.admin.home.adapters.VehicleRequestAdapter
import com.malik.transportation.databinding.FragmentDriversRequestsBinding
import com.malik.transportation.databinding.FragmentVehicleRequestBinding


class DriversRequestsFragment : Fragment(R.layout.fragment_drivers_requests), DriverRequestAdapter.OnItemClickListener {
    private var _binding: FragmentDriversRequestsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: DriverRequestAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriversRequestsBinding.bind(view)

        mAdapter = DriverRequestAdapter(
            requireContext(),
            this
        )
        binding.driverRequestRv.layoutManager = LinearLayoutManager(requireContext())
        binding.driverRequestRv.adapter = mAdapter

    }

    override fun onCardClick(position: Int) {
        findNavController().navigate(R.id.action_driversRequestsFragment_to_driverRequestDetailFragment)

    }
}