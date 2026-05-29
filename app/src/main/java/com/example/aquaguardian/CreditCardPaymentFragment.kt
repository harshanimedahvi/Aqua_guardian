package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CreditCardPaymentFragment : Fragment(R.layout.fragment_credit_card_payment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnPayNow = view.findViewById<Button>(R.id.btnPayNow)

        btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnPayNow.setOnClickListener {
            // Handle payment logic
        }
    }
}
