package com.malik.transportation.auth.fragments.teacher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverInfoBinding
import com.malik.transportation.databinding.FragmentTeacherPersonalInfoBinding


class TeacherPersonalInfoFragment : Fragment(R.layout.fragment_teacher_personal_info) {
    private var _binding: FragmentTeacherPersonalInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentTeacherPersonalInfoBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener {

                findNavController().navigate(R.id.action_teacherPersonalInfoFragment_to_teacherLocationFragment)
            }

        }

    }
}