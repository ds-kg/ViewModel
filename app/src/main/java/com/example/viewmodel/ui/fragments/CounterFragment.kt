package com.example.viewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.R
import com.example.viewmodel.databinding.FragmentCounterBinding
import com.example.viewmodel.ui.MainViewModel

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding
    private lateinit var model: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        model.counter.observe(requireActivity()){
            binding.tvCount.text = it.toString()
        }
    }
}