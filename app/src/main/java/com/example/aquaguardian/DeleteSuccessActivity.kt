package com.example.aquaguardian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FragmentDeleteSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_delete_success)

        val btnBack = findViewById<ImageView>(R.id.btnBack)


        btnBack.setOnClickListener {
            finish()
        }
    }
}