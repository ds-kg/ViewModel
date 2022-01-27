package com.example.viewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.FragmentAllBinding
import com.example.viewmodel.ui.MainViewModel


class AllFragment : Fragment() {

    private lateinit var binding: FragmentAllBinding
    private lateinit var model: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        model.text.observe(requireActivity()) {
            binding.tvResult.text = it.toString()
        }
    }
}