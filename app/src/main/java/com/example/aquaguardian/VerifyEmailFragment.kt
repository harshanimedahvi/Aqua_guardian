package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class VerifyEmailFragment : Fragment(R.layout.fragment_verify_email) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnVerifyEmailSubmit = view.findViewById<Button>(R.id.btnVerifyEmailSubmit)

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        btnVerifyEmailSubmit.setOnClickListener {
            Toast.makeText(context, "Email Verified Successfully!", Toast.LENGTH_SHORT).show()
            // Typically navigate to login or dashboard after verification
            findNavController().navigate(R.id.action_verifyEmailFragment_to_dashboardFragment)
        }
    }
}
