package com.example.viewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.FragmentOperationBinding
import com.example.viewmodel.ui.MainViewModel

class OperationFragment : Fragment() {

    private lateinit var binding: FragmentOperationBinding
    private lateinit var model: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOperationBinding.inflate(inflater)
        model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {
            model.increment()
        }
        binding.btnMinus.setOnClickListener {
            model.discrement()
        }

    }
}