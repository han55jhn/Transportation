package com.malik.transportation.auth.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.malik.transportation.R
import com.malik.transportation.`interface`.APIInterface
import com.malik.transportation.admin.home.activities.AdminHomeActivity
import com.malik.transportation.apiclient.APIClient
import com.malik.transportation.constants.Constants
import com.malik.transportation.databinding.FragmentSignInBinding
import com.malik.transportation.home.activity.*
import com.malik.transportation.model.Login
import com.malik.transportation.model.LoginResponse
import com.malik.transportation.model.SignupResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SignInFragment : Fragment(R.layout.fragment_sign_in) {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
    private var apiInterface: APIInterface? = null
    private lateinit var sharedPreferences: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentSignInBinding.bind(view)

        //apiInterface
        apiInterface = APIClient.client!!.create(APIInterface::class.java)
        //sharedPref
        sharedPreferences = requireActivity().getSharedPreferences(
            Constants.SHARED_PREF_NAME, Context.MODE_PRIVATE
        )

        binding.apply {
            createAccountTv.setOnClickListener {
                findNavController().navigate(R.id.action_signInFragment_to_registerFragment)
            }

            loginBtn.setOnClickListener {

                if (phoneEt.text.toString().isEmpty()) {
                    phoneEt.error = "Please enter phone number"
                    return@setOnClickListener
                }
                if (passwordEt.text.toString().isEmpty()) {
                    passwordEt.error = "Please enter password"
                    return@setOnClickListener
                }

                login()

            }
        }


    }

    private fun login() {

        val loginData = Login(
            binding.phoneEt.text.toString(),
            binding.passwordEt.text.toString()
        )

        binding.loading.visibility = View.VISIBLE
        val call: Call<LoginResponse> = apiInterface!!.login(
            loginData
        )

        call.enqueue(object : Callback<LoginResponse?> {
            override fun onResponse(
                call: Call<LoginResponse?>,
                response: Response<LoginResponse?>
            ) {

                when {
                    response.isSuccessful -> {
                        val loginResponse: LoginResponse? = response.body()
                        Log.e("loginResponse", loginResponse!!.toString())
                        binding.loading.visibility = View.GONE
                        Log.i("true", loginResponse.toString())
                        val editor: SharedPreferences.Editor =
                            sharedPreferences.edit()
                        editor.putString(Constants.userId, loginResponse.id.toString())
                        editor.putString(Constants.userRole, loginResponse.role)
                        editor.putBoolean(Constants.isLoggedIn, true)
                        editor.apply()
                        if (loginResponse.role == "admin") {

                            val intent = Intent(requireContext(), AdminHomeActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                        if (loginResponse.role == "institution") {

                            val intent = Intent(requireContext(), StudentHomeActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                        if (loginResponse.role == "transportation company") {

                            val intent = Intent(requireContext(), CompanyActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                        if (loginResponse.role == "teacher") {

                            val intent = Intent(requireContext(), TeacherHomeActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                        if (loginResponse.role == "university student") {

                            val intent = Intent(requireContext(), HomeActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                        if (loginResponse.role == "driver") {

                            val intent = Intent(requireContext(), DriverHomeActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }
                    }
                    response.code() == 422 -> {
                        binding.loading.visibility = View.GONE

                        Snackbar.make(
                            binding.root,
                            "Internal Server Error",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                    else -> {
                        binding.loading.visibility = View.GONE

                        Snackbar.make(
                            binding.root,
                            "Internal Server Error",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                }


            }

            override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
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