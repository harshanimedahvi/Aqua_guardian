package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DeleteSuccessFragment : Fragment(R.layout.fragment_delete_success) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Custom configurations or handling back click navigation directly back to records root list
        view.setOnClickListener {
            findNavController().navigate(R.id.action_deleteSuccessFragment_to_issueListFragment)
        }
    }
}