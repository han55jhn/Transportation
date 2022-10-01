package com.malik.transportation.auth.fragments.student

import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentConfirmationBinding
import com.malik.transportation.databinding.FragmentStudentSchoolDataBinding
import com.malik.transportation.home.activity.DriverHomeActivity
import com.malik.transportation.home.activity.HomeActivity
import com.malik.transportation.home.activity.StudentHomeActivity
import java.util.*


class StudentSchoolDataFragment : Fragment(R.layout.fragment_student_school_data) {
    private var _binding: FragmentStudentSchoolDataBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentStudentSchoolDataBinding.bind(view)
        binding.apply {
            nextBtn.setOnClickListener {
                val intent = Intent(requireContext(), StudentHomeActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
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