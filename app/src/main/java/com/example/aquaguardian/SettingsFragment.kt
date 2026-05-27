package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnSaveSettings = view.findViewById<Button>(R.id.btnSaveSettings)

        btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnSaveSettings.setOnClickListener {
            Toast.makeText(context, "Settings Saved Successfully", Toast.LENGTH_SHORT).show()
            findNavController().navigateUp()
        }
    }
}
