package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CreateUserProfileFragment : Fragment(R.layout.fragment_create_user_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnVerifyEmail = view.findViewById<Button>(R.id.btnVerifyEmail)
        val btnCreateProfile = view.findViewById<Button>(R.id.btnCreateProfile)
        
        val etName = view.findViewById<EditText>(R.id.etName)
        val etEmail = view.findViewById<EditText>(R.id.etEmail)
        val etLocation = view.findViewById<EditText>(R.id.etLocation)

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        btnVerifyEmail.setOnClickListener {
            val email = etEmail.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(context, "Verification email sent to $email", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_createUserProfileFragment_to_verifyEmailFragment)
            } else {
                Toast.makeText(context, "Please enter an email", Toast.LENGTH_SHORT).show()
            }
        }

        btnCreateProfile.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val location = etLocation.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && location.isNotEmpty()) {
                Toast.makeText(context, "Profile Created Successfully!", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_createUserProfileFragment_to_dashboardFragment)
            } else {
                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
