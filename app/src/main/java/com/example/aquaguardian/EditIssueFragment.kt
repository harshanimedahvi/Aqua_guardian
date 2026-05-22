package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class EditIssueFragment : Fragment(R.layout.fragment_edit_issue) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSaveChanges = view.findViewById<Button>(R.id.btnSaveChanges)

        btnSaveChanges.setOnClickListener {
            // Apply mutations to data engine here...
            findNavController().navigate(R.id.action_editIssueFragment_to_updateSuccessFragment)
        }
    }
}