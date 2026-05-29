package com.example.aquaguardian

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class UserProfileFragment : Fragment(R.layout.fragment_user_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnSettings = view.findViewById<ImageView>(R.id.btnSettings)
        val btnEditProfile = view.findViewById<Button>(R.id.btnEditProfile)
        val btnDeleteProfile = view.findViewById<Button>(R.id.btnDeleteProfile)
        val btnViewQualityHistory = view.findViewById<Button>(R.id.btnViewQualityHistory)

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_userProfileFragment_to_helpSupportFragment)
        }

        btnEditProfile.setOnClickListener {
            findNavController().navigate(R.id.action_userProfileFragment_to_createUserProfileFragment)
        }

        btnDeleteProfile.setOnClickListener {
            Toast.makeText(context, "Delete Profile Clicked", Toast.LENGTH_SHORT).show()
        }

        btnViewQualityHistory.setOnClickListener {
            val intent = Intent(requireContext(), WaterQualityHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}
