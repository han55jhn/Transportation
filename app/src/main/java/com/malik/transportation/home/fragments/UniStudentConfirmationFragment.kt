package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentTripRequestsBinding
import com.malik.transportation.databinding.FragmentUniStudentConfirmationBinding
import com.malik.transportation.home.adapter.TripRequestsAdapter


class UniStudentConfirmationFragment : Fragment(R.layout.fragment_uni_student_confirmation) {
    private var _binding: FragmentUniStudentConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentUniStudentConfirmationBinding.bind(view)


    }
}