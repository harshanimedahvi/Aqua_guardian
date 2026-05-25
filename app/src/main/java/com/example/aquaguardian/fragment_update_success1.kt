package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class UpdateSuccess1Fragment : Fragment(R.layout.fragment_update_success) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setOnClickListener {
            findNavController().navigate(R.id.action_updateSuccessFragment_to_issueListFragment)
        }
    }
}