package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentParentsAgreeBinding
import com.malik.transportation.databinding.FragmentTeacherAgreeBinding


class TeacherAgreeFragment : Fragment(R.layout.fragment_teacher_agree) {
    private var _binding: FragmentTeacherAgreeBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentTeacherAgreeBinding.bind(view)

        binding.agreeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_teacherAgreeFragment_to_teacherTripConfirmationFragment)
        }


        binding.disagreeBtn.setOnClickListener {
            findNavController().navigateUp()
        }


    }
}