package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentStudentRequestsBinding
import com.malik.transportation.databinding.FragmentTripRequestsBinding
import com.malik.transportation.home.adapter.StudentRequestsAdapter
import com.malik.transportation.home.adapter.TripRequestsAdapter


class TripRequestsFragment : Fragment() {
    private var _binding: FragmentTripRequestsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: TripRequestsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentTripRequestsBinding.bind(view)

        mAdapter = TripRequestsAdapter(
            requireContext()
        )
        binding.tripRequestsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.tripRequestsRv.adapter = mAdapter
    }
}