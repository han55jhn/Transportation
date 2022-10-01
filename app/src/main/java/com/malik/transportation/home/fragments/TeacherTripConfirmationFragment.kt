package com.malik.transportation.home.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentTeacherConfirmationBinding
import com.malik.transportation.databinding.FragmentTeacherTripConfirmationBinding
import com.malik.transportation.home.activity.TeacherHomeActivity


class TeacherTripConfirmationFragment : Fragment(R.layout.fragment_teacher_trip_confirmation) {
    private var _binding: FragmentTeacherTripConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentTeacherTripConfirmationBinding.bind(view)

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_teacherTripConfirmationFragment_to_teacherAvailableTripsFragment)

        }, 2000)

    }
}