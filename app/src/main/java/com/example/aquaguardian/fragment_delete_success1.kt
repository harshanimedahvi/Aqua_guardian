package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentDeleteSuccess : Fragment(R.layout.fragment_delete_success) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivBackArrow = view.findViewById<ImageView>(R.id.ivBackArrow)


        ivBackArrow.setOnClickListener {
            findNavController().navigate(R.id.action_deleteSuccessFragment_to_issueListFragment)
        }


        view.setOnClickListener {
            findNavController().navigate(R.id.action_deleteSuccessFragment_to_issueListFragment)
        }
    }
}