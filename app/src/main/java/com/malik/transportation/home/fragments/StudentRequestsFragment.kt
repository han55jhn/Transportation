package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverRequestBinding
import com.malik.transportation.databinding.FragmentStudentRequestsBinding
import com.malik.transportation.home.adapter.DriverRequestsAdapter
import com.malik.transportation.home.adapter.StudentRequestsAdapter


class StudentRequestsFragment : Fragment(R.layout.fragment_student_requests) {
    private var _binding: FragmentStudentRequestsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: StudentRequestsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentStudentRequestsBinding.bind(view)

        mAdapter = StudentRequestsAdapter(
            requireContext()
        )
        binding.studentRequestsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.studentRequestsRv.adapter = mAdapter
    }
}