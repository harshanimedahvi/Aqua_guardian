package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class WaterUsageHistoryFragment : Fragment(R.layout.fragment_water_usage_history) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<Button>(R.id.btnBack)
        val btnMonthlySummary = view.findViewById<Button>(R.id.btnMonthlySummary)


        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }


        btnMonthlySummary.setOnClickListener {
            // findNavController().navigate(R.id.action_waterUsageHistoryFragment_to_monthlySummaryFragment)
        }
    }
}