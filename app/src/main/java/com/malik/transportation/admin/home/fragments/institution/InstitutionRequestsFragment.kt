package com.malik.transportation.admin.home.fragments.institution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.EducationalInstitutionAdapter
import com.malik.transportation.databinding.FragmentAdminHomeBinding
import com.malik.transportation.databinding.FragmentInstitutionRequestsBinding
import com.malik.transportation.home.adapter.AvailTripsAdapter
import com.malik.transportation.home.adapter.TripRequestsAdapter


class InstitutionRequestsFragment : Fragment(R.layout.fragment_institution_requests),
    EducationalInstitutionAdapter.OnItemClickListener {
    private var _binding: FragmentInstitutionRequestsBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: EducationalInstitutionAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentInstitutionRequestsBinding.bind(view)

        mAdapter = EducationalInstitutionAdapter(
            requireContext(),
            this
        )
        binding.educationalInstitutionsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.educationalInstitutionsRv.adapter = mAdapter

    }

    override fun onCardClick(position: Int) {
        findNavController().navigate(R.id.action_institutionRequestsFragment_to_institutionDetailFragment)

    }
}