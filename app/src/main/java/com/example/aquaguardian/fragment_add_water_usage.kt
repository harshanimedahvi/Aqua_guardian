package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AddWaterUsageFragment : Fragment(R.layout.fragment_add_water_usage) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val etDate = view.findViewById<EditText>(R.id.etDate)
        val etWaterUsed = view.findViewById<EditText>(R.id.etWaterUsed)
        val etPurpose = view.findViewById<EditText>(R.id.etPurpose)
        val btnSave = view.findViewById<Button>(R.id.btnSave)
        val btnViewHistory = view.findViewById<Button>(R.id.btnViewHistory)


        btnSave.setOnClickListener {
            val date = etDate.text.toString().trim()
            val water = etWaterUsed.text.toString().trim()
            val purpose = etPurpose.text.toString().trim()

            if (date.isEmpty() || water.isEmpty() || purpose.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(requireContext(), "Water Usage Saved!", Toast.LENGTH_SHORT).show()


                findNavController().navigate(R.id.action_addWaterUsageFragment_to_waterUsageDetailFragment)
            }
        }


        btnViewHistory.setOnClickListener {

            findNavController().navigate(R.id.action_addWaterUsageFragment_to_waterUsageHistoryFragment)
        }
    }
}