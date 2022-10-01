package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentParentsAvailableTripsBinding
import com.malik.transportation.databinding.FragmentTeacherAvailableTripsBinding
import com.malik.transportation.home.adapter.ParentsAvailTripsAdapter
import com.malik.transportation.home.adapter.TeacherAvailTripsAdapter


class TeacherAvailableTripsFragment : Fragment(R.layout.fragment_teacher_available_trips), TeacherAvailTripsAdapter.OnItemClickListener {
    private var _binding: FragmentTeacherAvailableTripsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: TeacherAvailTripsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentTeacherAvailableTripsBinding.bind(view)

        mAdapter = TeacherAvailTripsAdapter(
            requireContext(),
            this
        )
        binding.tripsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.tripsRv.adapter = mAdapter

    }

    override fun onReservationClick(position: Int) {
        findNavController().navigate(R.id.action_teacherAvailableTripsFragment_to_teacherAgreeFragment)
    }
}