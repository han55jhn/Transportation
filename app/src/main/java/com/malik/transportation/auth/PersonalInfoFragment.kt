package com.malik.transportation.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentChooseLocationBinding
import com.malik.transportation.databinding.FragmentPersonalInfoBinding


class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {
    private var _binding: FragmentPersonalInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentPersonalInfoBinding.bind(view)


    }

}