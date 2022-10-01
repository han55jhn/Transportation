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
import com.malik.transportation.admin.home.adapters.VehicleRequestAdapter
import com.malik.transportation.databinding.FragmentInstitutionRequestsBinding
import com.malik.transportation.databinding.FragmentVehicleRequestBinding


class VehicleRequestFragment : Fragment(R.layout.fragment_vehicle_request), VehicleRequestAdapter.OnItemClickListener {
    private var _binding: FragmentVehicleRequestBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: VehicleRequestAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentVehicleRequestBinding.bind(view)

        mAdapter = VehicleRequestAdapter(
            requireContext(),
            this
        )
        binding.vehicleRequestRv.layoutManager = LinearLayoutManager(requireContext())
        binding.vehicleRequestRv.adapter = mAdapter

    }

    override fun onCardClick(position: Int) {
        findNavController().navigate(R.id.action_vehicleRequestFragment_to_vehicleRequestDetailFragment)

    }
}