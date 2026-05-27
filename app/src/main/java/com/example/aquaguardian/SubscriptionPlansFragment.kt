package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SubscriptionPlansFragment : Fragment(R.layout.fragment_subscription_plans) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)

        btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
