package com.example.aquaguardian

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WaterDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_detail)

        val btnBack = findViewById<ImageView>(R.id.btn_back)
        val tvDate = findViewById<TextView>(R.id.tvDetailDate)
        val tvColor = findViewById<TextView>(R.id.tvDetailColor)
        val tvSmell = findViewById<TextView>(R.id.tvDetailSmell)
        val tvNotes = findViewById<TextView>(R.id.tvDetailNotes)

        // Get data from Intent
        val date = intent.getStringExtra("DATE")
        val color = intent.getStringExtra("COLOR")
        val smell = intent.getStringExtra("SMELL")
        val notes = intent.getStringExtra("NOTES")

        // Display data
        tvDate.text = "Date: $date"
        tvColor.text = "Color: $color"
        tvSmell.text = "Has Smell: $smell"
        tvNotes.text = "Notes: $notes"

        btnBack?.setOnClickListener {
            finish()
        }
    }
}
