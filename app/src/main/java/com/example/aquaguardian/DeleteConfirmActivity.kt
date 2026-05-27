package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DeleteConfirmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_delete_confirm)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnDelete = findViewById<Button>(R.id.btnDelete)
        val btnCancel = findViewById<Button>(R.id.btnCancel)


        btnBack.setOnClickListener {
            finish()
        }


        btnCancel.setOnClickListener {
            Toast.makeText(this, "Deletion Cancelled", Toast.LENGTH_SHORT).show()
            finish()
        }


        btnDelete.setOnClickListener {

            Toast.makeText(this, "Record Deleted Successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}