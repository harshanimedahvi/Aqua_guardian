package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class IssueDetailsFragment : Fragment(R.layout.fragment_issue_details) {

    private var currentIssue: WaterIssue? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        currentIssue = arguments?.getSerializable("selected_issue") as? WaterIssue

        val btnEdit = view.findViewById<Button>(R.id.btnEdit)
        val btnDelete = view.findViewById<Button>(R.id.btnDelete)

        btnEdit.setOnClickListener {
            val bundle = bundleOf("edit_issue" to currentIssue)
            findNavController().navigate(R.id.action_issueDetailsFragment_to_editIssueFragment, bundle)
        }

        btnDelete.setOnClickListener {
            val bundle = bundleOf("delete_issue_id" to currentIssue?.id)
            findNavController().navigate(R.id.action_issueDetailsFragment_to_deleteWarningFragment, bundle)
        }
    }
}