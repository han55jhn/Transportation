package com.malik.transportation.admin.home.fragments.institution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.admin.home.adapters.EducationalInstitutionAdapter
import com.malik.transportation.databinding.FragmentInstitutionDetailBinding
import com.malik.transportation.databinding.FragmentInstitutionRequestsBinding


class InstitutionDetailFragment : Fragment(R.layout.fragment_institution_detail) {
    private var _binding: FragmentInstitutionDetailBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentInstitutionDetailBinding.bind(view)



    }


}