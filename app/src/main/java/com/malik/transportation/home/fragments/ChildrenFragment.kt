package com.malik.transportation.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.malik.transportation.R
import com.malik.transportation.databinding.FragmentAddChildrenBinding
import com.malik.transportation.databinding.FragmentChildrenBinding
import com.malik.transportation.home.adapter.AvailTripsAdapter
import com.malik.transportation.home.adapter.ChildrenAdapter


class ChildrenFragment : Fragment(R.layout.fragment_children), ChildrenAdapter.OnItemClickListener {
    private var _binding: FragmentChildrenBinding? = null
    private val binding get() = _binding!!
    private var mAdapter: ChildrenAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewBinding
        _binding = FragmentChildrenBinding.bind(view)

        mAdapter = ChildrenAdapter(
            requireContext(),
            this
        )
        binding.childrenRv.layoutManager = LinearLayoutManager(requireContext())
        binding.childrenRv.adapter = mAdapter

        binding.addChildTv.setOnClickListener {
            findNavController().navigate(R.id.action_childrenFragment_to_addChildrenFragment)
        }



    }
    override fun onChildClick(position: Int) {
        findNavController().navigate(R.id.action_childrenFragment_to_parentsAgreeFragment)
    }
}