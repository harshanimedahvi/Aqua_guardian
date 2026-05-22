package com.example.aquaguardian

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class IssueListFragment : Fragment(R.layout.fragment_issue_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Assign these IDs to your layout's tap-to-view buttons respectively
        val btnView1 = view.findViewById<Button>(R.id.btnViewIssue1)
        val btnView2 = view.findViewById<Button>(R.id.btnViewIssue2)
        val btnView3 = view.findViewById<Button>(R.id.btnViewIssue3)

        // Mock objects representing current architectural states matching screenshots
        val issue1 = WaterIssue("1", "Dirty Water Supply", "Zone 4 Block B", "Industrial waste residue apparent...", "In Progress", R.drawable.sample_water_issue_1)
        val issue2 = WaterIssue("2", "No Supply Leak", "Main Line Sector 7", "Main line pipeline fracture...", "Pending", R.drawable.sample_water_issue_2)
        val issue3 = WaterIssue("3", "Pipe Burst Wastewater", "East Intersection", "Resolved issue report...", "Resolved", R.drawable.sample_water_issue_3)

        btnView1?.setOnClickListener { openDetails(issue1) }
        btnView2?.setOnClickListener { openDetails(issue2) }
        btnView3?.setOnClickListener { openDetails(issue3) }
    }

    private fun openDetails(issue: WaterIssue) {
        val bundle = bundleOf("selected_issue" to issue)
        findNavController().navigate(R.id.action_issueListFragment_to_issueDetailsFragment, bundle)
    }
}