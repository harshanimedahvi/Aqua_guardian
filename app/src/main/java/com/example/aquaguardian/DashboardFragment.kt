package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnReportIssue = view.findViewById<LinearLayout>(R.id.btnReportIssue)
        val btnWaterUsage = view.findViewById<LinearLayout>(R.id.btnWaterUsage)
        val btnProfile = view.findViewById<LinearLayout>(R.id.btnProfile)

        btnReportIssue.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_reportIssueFragment)
        }

        btnWaterUsage.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_addWaterUsageFragment)
        }

        btnProfile.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_userProfileFragment)
        }
    }
}