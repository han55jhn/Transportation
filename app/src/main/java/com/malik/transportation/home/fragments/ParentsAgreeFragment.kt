package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAgreeBinding
import com.malik.transportation.databinding.FragmentParentsAgreeBinding


class ParentsAgreeFragment : Fragment(R.layout.fragment_parents_agree) {
    private var _binding: FragmentParentsAgreeBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentParentsAgreeBinding.bind(view)

        binding.agreeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_parentsAgreeFragment_to_parentsConfirmationFragment2)
        }

        binding.disagreeBtn.setOnClickListener {
            findNavController().navigateUp()
        }



    }
}