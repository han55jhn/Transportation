package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAvailableTripsBinding
import com.malik.transportation.databinding.FragmentConfirmationBinding
import com.malik.transportation.home.adapter.AvailTripsAdapter


class AvailableTripsFragment : Fragment(R.layout.fragment_available_trips) {
    private var _binding: FragmentAvailableTripsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: AvailTripsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentAvailableTripsBinding.bind(view)

        mAdapter = AvailTripsAdapter(
            requireContext()
        )
        binding.tripsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.tripsRv.adapter = mAdapter
    }
}