package com.malik.transportation.auth.fragments.parents

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentParentsConfirmationBinding
import com.malik.transportation.databinding.FragmentVehicleConfirmationBinding
import com.malik.transportation.home.activity.DriverHomeActivity
import com.malik.transportation.home.activity.ParentsHomeActivity


class ParentsConfirmationFragment : Fragment(R.layout.fragment_parents_confirmation) {
    private var _binding: FragmentParentsConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentParentsConfirmationBinding.bind(view)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(requireContext(), ParentsHomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }, 2000)

    }
}