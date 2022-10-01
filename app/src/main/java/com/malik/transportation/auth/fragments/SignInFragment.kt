package com.malik.transportation.auth.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentRegisterBinding
import com.malik.transportation.databinding.FragmentSignInBinding
import com.malik.transportation.home.activity.HomeActivity


class SignInFragment : Fragment(R.layout.fragment_sign_in) {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentSignInBinding.bind(view)

        binding.apply {
            createAccountTv.setOnClickListener {
                findNavController().navigate(R.id.action_signInFragment_to_registerFragment)
            }

            loginBtn.setOnClickListener {
                val intent = Intent(requireContext(), HomeActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
        }


    }
}