package com.malik.transportation.auth.fragments.driver

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.afollestad.vvalidator.form
import com.google.android.material.snackbar.Snackbar
import com.malik.transportation.R
import com.malik.transportation.`interface`.APIInterface
import com.malik.transportation.admin.home.activities.AdminHomeActivity
import com.malik.transportation.apiclient.APIClient
import com.malik.transportation.constants.Constants
import com.malik.transportation.databinding.FragmentDriverInfoBinding
import com.malik.transportation.model.Login
import com.malik.transportation.model.LoginResponse
import com.malik.transportation.model.Signup
import com.malik.transportation.model.SignupResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DriverInfoFragment : Fragment(R.layout.fragment_driver_info) {
    private val args: DriverInfoFragmentArgs by navArgs()
    private var _binding: FragmentDriverInfoBinding? = null
    private val binding get() = _binding!!
    private var apiInterface: APIInterface? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentDriverInfoBinding.bind(view)

        //apiInterface
        apiInterface = APIClient.client!!.create(APIInterface::class.java)

        binding.apply {
            form {
                input(firstNameEt, name = "First Name") {
                    isNotEmpty()

                }
                input(lastNameEt, name = "Last Name") {
                    isNotEmpty()

                }
                input(idNumberEt, name = getString(R.string.identification_number)) {
                    isNotEmpty()
                }
                input(mobileNumberEt, name = getString(R.string.mobile_number)) {
                    isNotEmpty()
                }
                input(passwordEt, name = "Password") {
                    isNotEmpty()

                    length().atLeast(6)
                }
                input(confirmPasswordEt, name = "Confirm Password") {
                    isNotEmpty()
                    length().atLeast(6)
                }

                submitWith(nextBtn) {
                    if (passwordEt.text.toString() == confirmPasswordEt.text.toString()) {
                        signup()
                    } else {
                        Snackbar.make(
                            binding.root,
                            "Please enter same password and confirm password",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }


//
                }

            }
        }
    }


    private fun signup() {
        val signupData = Signup(
            binding.mobileNumberEt.text.toString(),
            binding.firstNameEt.text.toString()+ " "+ binding.lastNameEt.text.toString(),
            binding.passwordEt.text.toString(),
            "pending",
            binding.idNumberEt.text.toString(),
            args.type
        )

        binding.loading.visibility = View.VISIBLE
        val call: Call<SignupResponse> = apiInterface!!.signup(
            signupData
        )

        call.enqueue(object : Callback<SignupResponse?> {
            override fun onResponse(
                call: Call<SignupResponse?>,
                response: Response<SignupResponse?>
            ) {
                val signupResponse: SignupResponse? = response.body()
                Log.e("signupResponse",signupResponse!!.name)
                when {
                    response.isSuccessful -> {
                        val signupResponse: SignupResponse? = response.body()
                        binding.loading.visibility = View.GONE
                        findNavController().navigate(R.id.action_driverInfoFragment_to_driverInfoConfirmationFragment)
                    }
                    response.code() == 422 -> {
                        binding.loading.visibility = View.GONE

                        Snackbar.make(
                            binding.root,
                            "Failed",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                    else -> {
                        binding.loading.visibility = View.GONE

                        Snackbar.make(
                            binding.root,
                            "Failed",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                }
            }

            override fun onFailure(call: Call<SignupResponse?>, t: Throwable) {
                binding.loading.visibility = View.GONE
                Snackbar.make(
                    binding.root,
                    t.toString(),
                    Snackbar.LENGTH_LONG
                ).show()
                Log.i("Error", t.message.toString())
                call.cancel()
            }
        })


    }
}