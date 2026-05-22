package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ReportIssueFragment : Fragment(R.layout.fragment_report_issue) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit = view.findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            // After database transactions, navigate directly to modification success view
            findNavController().navigate(R.id.action_reportIssueFragment_to_updateSuccessFragment)
        }
    }
}