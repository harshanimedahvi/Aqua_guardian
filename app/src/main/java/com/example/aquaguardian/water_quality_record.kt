package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WaterQualityRecord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_quality_record)


        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val etDate = findViewById<EditText>(R.id.etDate)
        val cbClear = findViewById<CheckBox>(R.id.cbClear)
        val cbDirty = findViewById<CheckBox>(R.id.cbDirty)
        val cbSmellYes = findViewById<CheckBox>(R.id.cbSmellYes)
        val cbSmellNo = findViewById<CheckBox>(R.id.cbSmellNo)
        val etNotes = findViewById<EditText>(R.id.etNotes)
        val btnSaveRecord = findViewById<Button>(R.id.btnSaveRecord)


        btnBack.setOnClickListener {
            finish()
        }


        cbClear.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbDirty.isChecked = false
        }
        cbDirty.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbClear.isChecked = false
        }

        cbSmellYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbSmellNo.isChecked = false
        }
        cbSmellNo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbSmellYes.isChecked = false
        }

        // Save Button Click Listener
        btnSaveRecord.setOnClickListener {
            val date = etDate.text.toString()
            val notes = etNotes.text.toString()

            val waterColor = when {
                cbClear.isChecked -> "Clear"
                cbDirty.isChecked -> "Slightly Dirty"
                else -> "Not Selected"
            }

            val hasSmell = when {
                cbSmellYes.isChecked -> "Yes"
                cbSmellNo.isChecked -> "No"
                else -> "Not Selected"
            }


            if (date.isNotEmpty()) {
                Toast.makeText(this, "Record Saved successfully!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Please enter the date", Toast.LENGTH_SHORT).show()
            }
        }
    }
}