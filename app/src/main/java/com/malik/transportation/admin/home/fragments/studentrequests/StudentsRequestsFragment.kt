package com.malik.transportation.admin.home.fragments.studentrequests

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.DriverRequestAdapter
import com.malik.transportation.admin.home.adapters.StudentsRequestAdapter
import com.malik.transportation.databinding.FragmentDriversRequestsBinding
import com.malik.transportation.databinding.FragmentStudentsRequestsBinding


class StudentsRequestsFragment : Fragment(R.layout.fragment_students_requests), StudentsRequestAdapter.OnItemClickListener {
    private var _binding: FragmentStudentsRequestsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: StudentsRequestAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentStudentsRequestsBinding.bind(view)

        mAdapter = StudentsRequestAdapter(
            requireContext(),
            this
        )
        binding.driverRequestRv.layoutManager = LinearLayoutManager(requireContext())
        binding.driverRequestRv.adapter = mAdapter

    }

    override fun onCardClick(position: Int) {
        findNavController().navigate(R.id.action_studentsRequestsFragment_to_studentsRequestsDetailFragment)

    }
}