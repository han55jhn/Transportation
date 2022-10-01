package com.malik.transportation.auth.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentConfirmationBinding
import com.malik.transportation.home.activity.HomeActivity


class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {
    private var _binding: FragmentConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentConfirmationBinding.bind(view)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }, 2000)
    }
}