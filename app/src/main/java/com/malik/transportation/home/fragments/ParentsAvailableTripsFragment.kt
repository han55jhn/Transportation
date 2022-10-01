package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAvailableTripsBinding
import com.malik.transportation.databinding.FragmentParentsAvailableTripsBinding
import com.malik.transportation.home.adapter.AvailTripsAdapter
import com.malik.transportation.home.adapter.ParentsAvailTripsAdapter


class ParentsAvailableTripsFragment : Fragment(R.layout.fragment_parents_available_trips),ParentsAvailTripsAdapter.OnItemClickListener {
    private var _binding: FragmentParentsAvailableTripsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: ParentsAvailTripsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentParentsAvailableTripsBinding.bind(view)

        mAdapter = ParentsAvailTripsAdapter(
            requireContext(),
            this
        )
        binding.tripsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.tripsRv.adapter = mAdapter

    }

    override fun onReservationClick(position: Int) {
        findNavController().navigate(R.id.action_parentsAvailableTripsFragment_to_childrenFragment)
    }
}