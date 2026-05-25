package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class FragmentDeleteDialog1 : Fragment(R.layout.fragment_delete_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnConfirmDelete = view.findViewById<Button>(R.id.btnConfirmDelete)
        val btnCancel = view.findViewById<Button>(R.id.btnCancel)

      
        btnConfirmDelete.setOnClickListener {
            findNavController().navigate(R.id.action_deleteWarningFragment_to_deleteSuccessFragment)
        }

        
        btnCancel.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}