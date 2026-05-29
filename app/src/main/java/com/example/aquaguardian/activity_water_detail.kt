package com.example.aquaguardian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WaterDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // XML layout fail annu activity ge set maduvudu
        setContentView(R.layout.activity_water_detail)

        // Back Arrow Button id upayogisi find maduvudu
        val btnBack = findViewById<ImageView>(R.id.btn_back)

        // Back button click madidaga hindina screen ge hoguvudu
        btnBack?.setOnClickListener {
            finish()
        }
    }
}