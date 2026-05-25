package com.example.aquaguardian

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class MonthlyTestUsageSummaryActivity : AppCompatActivity() {

    private lateinit var pieChart: PieChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monthly_test_usage_summery)

        pieChart = findViewById(R.id.pieChart)

        setupPieChart()
    }

    private fun setupPieChart() {
        val entries = ArrayList<PieEntry>()
        entries.add(PieEntry(40f, "Body care"))
        entries.add(PieEntry(30f, "Toilet flushing"))
        entries.add(PieEntry(13f, "Laundry washing"))
        entries.add(PieEntry(7f, "Washing dishes"))
        entries.add(PieEntry(6f, "House cleaning"))
        entries.add(PieEntry(4f, "Eating and drinking"))

        val dataSet = PieDataSet(entries, "")

        val customColors = intArrayOf(
            Color.parseColor("#1D2D6B"),
            Color.parseColor("#0C58A7"),
            Color.parseColor("#53B9DB"),
            Color.parseColor("#0091A4"),
            Color.parseColor("#742582"),
            Color.parseColor("#0A4384")
        )
        dataSet.colors = customColors.toList()

        dataSet.valueTextColor = Color.WHITE
        dataSet.valueTextSize = 14f

        val data = PieData(dataSet)
        pieChart.data = data

        pieChart.isDrawHoleEnabled = false
        pieChart.description.isEnabled = false
        pieChart.legend.isEnabled = false

        pieChart.invalidate()
    }
}
