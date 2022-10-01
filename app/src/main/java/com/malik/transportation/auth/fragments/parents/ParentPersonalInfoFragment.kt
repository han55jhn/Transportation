package com.malik.transportation.auth.fragments.parents

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentParentPersonalInfoBinding
import com.malik.transportation.databinding.FragmentStudentSchoolDataBinding
import com.malik.transportation.home.activity.StudentHomeActivity


class ParentPersonalInfoFragment : Fragment(R.layout.fragment_parent_personal_info) {
    private var _binding: FragmentParentPersonalInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentParentPersonalInfoBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener{

            findNavController().navigate(R.id.action_parentPersonalInfoFragment_to_parentLocationFragment)
            }


        }

    }
}