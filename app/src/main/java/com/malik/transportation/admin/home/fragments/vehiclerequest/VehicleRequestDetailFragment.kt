package com.malik.transportation.admin.home.fragments.vehiclerequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.EducationalInstitutionAdapter
import com.malik.transportation.databinding.FragmentVehicleRequestBinding
import com.malik.transportation.databinding.FragmentVehicleRequestDetailBinding


class VehicleRequestDetailFragment : Fragment(R.layout.fragment_vehicle_request_detail) {
    private var _binding: FragmentVehicleRequestDetailBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentVehicleRequestDetailBinding.bind(view)


    }


}