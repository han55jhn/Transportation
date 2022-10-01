package com.malik.transportation.admin.home.fragments.driverrequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentDriverRequestDetailBinding
import com.malik.transportation.databinding.FragmentVehicleRequestDetailBinding


class DriverRequestDetailFragment : Fragment(R.layout.fragment_driver_request_detail) {
    private var _binding: FragmentDriverRequestDetailBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverRequestDetailBinding.bind(view)


    }


}