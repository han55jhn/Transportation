package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAddChildrenBinding
import com.malik.transportation.databinding.FragmentAgreeBinding


class AddChildrenFragment : Fragment(R.layout.fragment_add_children) {
    private var _binding: FragmentAddChildrenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentAddChildrenBinding.bind(view)




    }
}