package com.malik.transportation.admin.auth.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.malik.transportation.R
import com.malik.transportation.admin.home.activities.AdminHomeActivity
import com.malik.transportation.databinding.FragmentAdminLoginBinding

class AdminLoginFragment : Fragment(R.layout.fragment_admin_login) {
    private var _binding: FragmentAdminLoginBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentAdminLoginBinding.bind(view)

        binding.loginBtn.setOnClickListener {
            val intent = Intent(requireContext(), AdminHomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }


    }
}