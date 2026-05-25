package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class WaterUsageDetailFragment : Fragment(R.layout.fragment_water_usage_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnEdit = view.findViewById<Button>(R.id.btnEdit)
        val btnDelete = view.findViewById<Button>(R.id.btnDelete)


        btnEdit.setOnClickListener {
            findNavController().navigate(R.id.action_waterUsageDetailFragment_to_editIssueFragment)
        }


        btnDelete.setOnClickListener {
            findNavController().navigate(R.id.action_waterUsageDetailFragment_to_deleteWarningFragment)
        }
    }
}