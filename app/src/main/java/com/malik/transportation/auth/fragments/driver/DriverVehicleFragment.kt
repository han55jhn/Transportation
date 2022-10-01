package com.malik.transportation.auth.fragments.driver

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.`interface`.APIInterface
import com.malik.transportation.apiclient.APIClient
import com.malik.transportation.databinding.FragmentDriverVehicleBinding
import com.malik.transportation.model.SchoolResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DriverVehicleFragment : Fragment(R.layout.fragment_driver_vehicle) {
    private var _binding: FragmentDriverVehicleBinding? = null
    private val binding get() = _binding!!
    private var apiInterface: APIInterface? = null
    private var schoolName: ArrayList<String> = ArrayList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverVehicleBinding.bind(view)

        //apiInterface
        apiInterface = APIClient.client!!.create(APIInterface::class.java)
        getSchools()

        binding.apply {
            nextBtn.setOnClickListener {
                findNavController().navigate(R.id.action_driverVehicleFragment_to_vehicleConfirmationFragment)

            }
        }

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
                    val typeAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
                        requireContext(),
                        android.R.layout.simple_dropdown_item_1line,
                        schoolName as List<Any?>
                    )
                    //set spinner adapter
                    binding.institutionSpinner.adapter = typeAdapter
                }
            }

            override fun onFailure(call: Call<SchoolResponse?>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

}