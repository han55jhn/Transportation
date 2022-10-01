package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverHomeBinding
import com.malik.transportation.databinding.FragmentDriverRequestBinding
import com.malik.transportation.home.adapter.DriverOrderAdapter
import com.malik.transportation.home.adapter.DriverRequestsAdapter


class DriverRequestFragment : Fragment(R.layout.fragment_driver_request) {
    private var _binding: FragmentDriverRequestBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: DriverRequestsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverRequestBinding.bind(view)

        mAdapter = DriverRequestsAdapter(
            requireContext()
        )
        binding.driverRequestsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.driverRequestsRv.adapter = mAdapter
    }
}