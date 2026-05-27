package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditWaterQualityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_water_quality)


        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnEditRecord = findViewById<Button>(R.id.btnEditRecord)

        val btnTriDate = findViewById<ImageButton>(R.id.btnTriDate)
        val btnTriNotes = findViewById<ImageButton>(R.id.btnTriNotes)
        val btnTriColor = findViewById<ImageButton>(R.id.btnTriColor)
        val btnTriSmell = findViewById<ImageButton>(R.id.btnTriSmell)


        btnBack.setOnClickListener {
            finish()
        }

        btnEditRecord.setOnClickListener {
            Toast.makeText(this, "Select a specific triangle category to edit", Toast.LENGTH_SHORT).show()
        }


        btnTriDate.setOnClickListener {
            Toast.makeText(this, "Date Editor Opening...", Toast.LENGTH_SHORT).show()
        }

        btnTriNotes.setOnClickListener {
            Toast.makeText(this, "Notes Editor Opening...", Toast.LENGTH_SHORT).show()
        }

        btnTriColor.setOnClickListener {
            Toast.makeText(this, "Water Color Editor Opening...", Toast.LENGTH_SHORT).show()
        }

        btnTriSmell.setOnClickListener {
            Toast.makeText(this, "Smell Editor Opening...", Toast.LENGTH_SHORT).show()
        }
    }
}