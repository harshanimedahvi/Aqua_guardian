package com.example.aquaguardian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SaveSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_success)


        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnReadDetail = findViewById<Button>(R.id.btnReadDetail)
        val btnCheckHistory = findViewById<Button>(R.id.btnCheckHistory)


        btnBack.setOnClickListener {
            finish()
        }


        btnReadDetail.setOnClickListener {
            val intent = Intent(this, WaterDetailActivity::class.java)
            startActivity(intent)
        }


        btnCheckHistory.setOnClickListener {

            val intent = Intent(this, WaterQualityHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}