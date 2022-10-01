package com.malik.transportation.auth.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentRegisterBinding
import com.tiper.MaterialSpinner


class RegisterFragment : Fragment(R.layout.fragment_register) {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    private var registrationType: Array<String>? = null
    private var selectedType: String? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentRegisterBinding.bind(view)
        registrationType = resources.getStringArray(R.array.profile_type)

        val typeAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            registrationType!!
        )
        //set spinner adapter
        binding.registrationTypeSpinner.adapter = typeAdapter

        binding.registrationTypeSpinner.apply {
            onItemSelectedListener = listener
        }

        binding.apply {
            nextBtn.setOnClickListener {

                if (selectedType == "University Student") {

                    findNavController().navigate(R.id.action_registerFragment_to_personalInfoFragment)
                }
                if (selectedType == "Driver") {
                    findNavController().navigate(R.id.action_registerFragment_to_driverInfoFragment)
                }
                if (selectedType == "Student") {
                    findNavController().navigate(R.id.action_registerFragment_to_studentSchoolDataFragment)
                }
                if (selectedType == "Parents") {
                    findNavController().navigate(R.id.action_registerFragment_to_parentPersonalInfoFragment)
                }
            }

        }


    }

    private val listener by lazy {
        object : MaterialSpinner.OnItemSelectedListener {
            override fun onItemSelected(
                parent: MaterialSpinner,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedType = parent.selectedItem.toString()
                parent.focusSearch(View.FOCUS_UP)?.requestFocus()
            }

            override fun onNothingSelected(parent: MaterialSpinner) {
                Log.v("MaterialSpinner", "onNothingSelected parent=${parent.id}")
            }
        }
    }
}