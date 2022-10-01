package com.malik.transportation.auth.fragments

import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TimePicker
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentChooseLocationBinding
import com.malik.transportation.databinding.FragmentPersonalInfoBinding
import java.util.*


class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {
    private var _binding: FragmentPersonalInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentPersonalInfoBinding.bind(view)

        binding.apply {
            nextBtn.setOnClickListener {
                findNavController().navigate(R.id.action_personalInfoFragment_to_chooseLocationFragment)
            }

            schoolStartTimeEt.setOnClickListener{
                setTime(schoolStartTimeEt)
            }
            schoolEndTimeEt.setOnClickListener{
                setTime(schoolEndTimeEt)
            }
        }
    }

    private fun setTime(schoolTimeEt: TextInputEditText) {
        val mTimePicker: TimePickerDialog
        val mCurrentTime = Calendar.getInstance()
        val hour = mCurrentTime.get(Calendar.HOUR_OF_DAY)
        val minute = mCurrentTime.get(Calendar.MINUTE)

        mTimePicker = TimePickerDialog(requireContext(),
            { view, hourOfDay, minute -> schoolTimeEt.setText(String.format("%d : %d", hourOfDay, minute)) }, hour, minute, false)

        mTimePicker.show()


    }

}