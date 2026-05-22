package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment(R.layout.fragment_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSignUp = view.findViewById<Button>(R.id.btnSignUp)
        val tvSignInLink = view.findViewById<TextView>(R.id.tvSignInLink)

        btnSignUp?.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_dashboardFragment)
        }

        tvSignInLink?.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }
}