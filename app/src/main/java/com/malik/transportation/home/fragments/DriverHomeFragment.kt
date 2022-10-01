package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAvailableTripsBinding
import com.malik.transportation.databinding.FragmentDriverHomeBinding
import com.malik.transportation.home.adapter.AvailTripsAdapter
import com.malik.transportation.home.adapter.DriverOrderAdapter


class DriverHomeFragment : Fragment(R.layout.fragment_driver_home) {
    private var _binding: FragmentDriverHomeBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: DriverOrderAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverHomeBinding.bind(view)

        mAdapter = DriverOrderAdapter(
            requireContext()
        )
        binding.ordersRv.layoutManager = LinearLayoutManager(requireContext())
        binding.ordersRv.adapter = mAdapter
    }
}