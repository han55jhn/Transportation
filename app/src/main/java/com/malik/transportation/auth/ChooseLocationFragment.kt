package com.malik.transportation.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentChooseLocationBinding
import com.malik.transportation.databinding.FragmentConfirmationBinding


class ChooseLocationFragment : Fragment(R.layout.fragment_choose_location) {
    private var _binding: FragmentChooseLocationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentChooseLocationBinding.bind(view)


    }
}