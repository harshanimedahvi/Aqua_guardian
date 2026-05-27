package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DeleteAccountFragment : Fragment(R.layout.fragment_delete_account) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageView>(R.id.btnBack)
        val btnCancel = view.findViewById<Button>(R.id.btnCancel)
        val btnDelete = view.findViewById<Button>(R.id.btnDelete)

        btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnCancel.setOnClickListener {
            findNavController().navigateUp()
        }

        btnDelete.setOnClickListener {
            // TODO: Implement account deletion logic
        }
    }
}
