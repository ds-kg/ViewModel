package com.example.viewmodel.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewmodel.ui.fragments.AllFragment
import com.example.viewmodel.ui.fragments.CounterFragment
import com.example.viewmodel.ui.fragments.OperationFragment

class ViewAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                OperationFragment()
            }
            1 -> {
                CounterFragment()
            }
            2 -> {
                AllFragment()
            }
            else -> {
                OperationFragment()
            }

        }
    }
}