package com.malik.transportation.auth.fragments.student

import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText
import com.malik.transportation.R
import com.malik.transportation.`interface`.APIInterface
import com.malik.transportation.apiclient.APIClient
import com.malik.transportation.databinding.FragmentConfirmationBinding
import com.malik.transportation.databinding.FragmentStudentSchoolDataBinding
import com.malik.transportation.home.activity.DriverHomeActivity
import com.malik.transportation.home.activity.HomeActivity
import com.malik.transportation.home.activity.StudentHomeActivity
import com.malik.transportation.model.SchoolResponse
import com.tiper.MaterialSpinner
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class StudentSchoolDataFragment : Fragment(R.layout.fragment_student_school_data) {
    private val args: StudentSchoolDataFragmentArgs by navArgs()

    private var _binding: FragmentStudentSchoolDataBinding? = null
    private val binding get() = _binding!!
    private var apiInterface: APIInterface? = null
    private var schoolName: ArrayList<String> = ArrayList()
    private var schoolId: ArrayList<Int> = ArrayList()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentStudentSchoolDataBinding.bind(view)

        //apiInterface
        apiInterface = APIClient.client!!.create(APIInterface::class.java)
        getSchools()

        binding.apply {
            nextBtn.setOnClickListener {
                val intent = Intent(requireContext(), StudentHomeActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }

            inTimeEt.setOnClickListener{
                setTime(inTimeEt)
            }
            outTimeEt.setOnClickListener{
                setTime(inTimeEt)
            }
        }

        binding.nearBySpinner.apply {
            onItemSelectedListener = listener
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


    private fun getSchools() {
        val call: Call<SchoolResponse> = apiInterface!!.getSchoolList(
        )
        call.enqueue(object : Callback<SchoolResponse?> {
            override fun onResponse(
                call: Call<SchoolResponse?>,
                response: Response<SchoolResponse?>
            ) {
                if (response.isSuccessful) {
                    val schoolResponse: SchoolResponse = response.body()!!
                    Log.e("schoolResponse",schoolResponse.toString())


                    schoolResponse.forEach {
                        schoolName.add(it.schoolName)
                    }
                    schoolResponse.forEach {
                        schoolId.add(it.id)
                    }
                    val typeAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
                        requireContext(),
                        android.R.layout.simple_dropdown_item_1line,
                        schoolName as List<Any?>
                    )
                    //set spinner adapter
                    binding.nearBySpinner.adapter = typeAdapter
                }
            }

            override fun onFailure(call: Call<SchoolResponse?>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
    private val listener by lazy {
        object : MaterialSpinner.OnItemSelectedListener {
            override fun onItemSelected(
                parent: MaterialSpinner,
                view: View?,
                position: Int,
                id: Long
            ) {
               Log.e("schoolId", schoolId[position].toString())
                parent.focusSearch(View.FOCUS_UP)?.requestFocus()
            }

            override fun onNothingSelected(parent: MaterialSpinner) {
                Log.v("MaterialSpinner", "onNothingSelected parent=${parent.id}")
            }
        }
    }
}