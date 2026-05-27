package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HelpSupportFragment : Fragment(R.layout.fragment_help_support) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnContactSupport = view.findViewById<Button>(R.id.btnContactSupport)
        val btnPremiumPlanInfo = view.findViewById<View>(R.id.btnPremiumPlanInfo)

        btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnContactSupport.setOnClickListener {
            Toast.makeText(context, "Contact Support Clicked", Toast.LENGTH_SHORT).show()
        }

        btnPremiumPlanInfo.setOnClickListener {
            findNavController().navigate(R.id.action_helpSupportFragment_to_subscriptionPlansFragment)
        }
    }
}
