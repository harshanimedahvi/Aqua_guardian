package com.example.aquaguardian

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

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        btnSettings.setOnClickListener {
            Toast.makeText(context, "Settings Clicked", Toast.LENGTH_SHORT).show()
        }

        btnEditProfile.setOnClickListener {
            findNavController().navigate(R.id.action_userProfileFragment_to_createUserProfileFragment)
        }

        btnDeleteProfile.setOnClickListener {
            Toast.makeText(context, "Delete Profile Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
