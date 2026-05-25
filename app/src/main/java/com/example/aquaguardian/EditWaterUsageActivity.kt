package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditWaterUsageActivity : AppCompatActivity() {

    private lateinit var etDate: EditText
    private lateinit var etWaterUsed: EditText
    private lateinit var etPurpose: EditText
    private lateinit var btnSaveChanges: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_edit_water_usage)

        // UI Elements Initialize kireema
        etDate = findViewById(R.id.etDate)
        etWaterUsed = findViewById(R.id.etWaterUsed)
        etPurpose = findViewById(R.id.etPurpose)
        btnSaveChanges = findViewById(R.id.btnSaveChanges)

        // Button Click Event Listener
        btnSaveChanges.setOnClickListener {
            saveChanges()
        }
    }

    private fun saveChanges() {
        val dateText = etDate.text.toString().trim()
        val waterText = etWaterUsed.text.toString().trim()
        val purposeText = etPurpose.text.toString().trim()

        // Fields gane validation (Histoiyada balanna)
        if (dateText.isEmpty() || waterText.isEmpty() || purposeText.isEmpty()) {
            Toast.makeText(this, "Please fill all fields!", Toast.LENGTH_SHORT).show()
            return
        }

        // TODO: Database (Firebase/Room) walata data pass karana code eka methanata danna.

        Toast.makeText(this, "Changes Saved Successfully!", Toast.LENGTH_SHORT).show()
    }
}
