package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WaterInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_info)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnCheckUsage = findViewById<Button>(R.id.btnCheckUsage)


        btnBack.setOnClickListener {
            finish()
        }

        // Check About Water Usage
        btnCheckUsage.setOnClickListener {

            Toast.makeText(this, "Checking Water Usage Details...", Toast.LENGTH_SHORT).show()
        }
    }
}