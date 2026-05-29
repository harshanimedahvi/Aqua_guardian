package com.example.aquaguardian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WaterQualityHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_water_quality_history)

        val rvWaterHistory = findViewById<RecyclerView>(R.id.rvWaterHistory)


        val waterHistoryData = listOf(
            WaterRecord("2026/01/01", "Clear", "No", "This day water supplies is good.", StatusType.SAFE),
            WaterRecord("2026/01/02", "Slightly Dirty", "Yes", "This day water had small bad smell.", StatusType.WARNING),
            WaterRecord("2026/01/03", "Slightly Dirty", "Yes", "This day water supplies is bad. On that day water had a bad smell.", StatusType.DANGER),
            WaterRecord("2026/01/04", "Clear", "No", "This day water supplies is good.", StatusType.SAFE),
            WaterRecord("2026/01/05", "Slightly Dirty", "Yes", "This day water supplies is bad.", StatusType.WARNING),
            WaterRecord("2026/01/06", "Clear", "No", "This day water supplies is good.", StatusType.SAFE)
        )


        val adapter = WaterHistoryAdapter(waterHistoryData) { record ->
            // Navigate to Detail Activity
            val intent = Intent(this, WaterDetailActivity::class.java)
            intent.putExtra("DATE", record.date)
            intent.putExtra("COLOR", record.color)
            intent.putExtra("SMELL", record.smell)
            intent.putExtra("NOTES", record.notes)
            startActivity(intent)
        }
        
        rvWaterHistory.layoutManager = GridLayoutManager(this, 2)
        rvWaterHistory.adapter = adapter


        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
