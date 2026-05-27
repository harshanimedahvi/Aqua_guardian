package com.example.aquaguardian

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WaterQualityRecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_quality_record)

        // 1. UI Elements සම්පූර්ණයෙන්ම හඳුන්වා දීම (Initialization)
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val etDate = findViewById<EditText>(R.id.etDate)
        val etNotes = findViewById<EditText>(R.id.etNotes)
        val btnSaveRecord = findViewById<Button>(R.id.btnSaveRecord)

        val cbClear = findViewById<CheckBox>(R.id.cbClear)
        val cbDirty = findViewById<CheckBox>(R.id.cbDirty)
        val cbSmellYes = findViewById<CheckBox>(R.id.cbSmellYes)
        val cbSmellNo = findViewById<CheckBox>(R.id.cbSmellNo)

        // 2. Back Button එක ක්ලික් කළ විට සිදුවන දේ
        btnBack.setOnClickListener {
            finish() // දැනට තියෙන Screen එක වහලා කලින් Screen එකට යනවා
        }

        // 3. Water Color CheckBoxes එකක් තෝරන විට අනෙක ඉබේම අයින් වීම
        cbClear.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbDirty.isChecked = false
        }
        cbDirty.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbClear.isChecked = false
        }

        // 4. Smell CheckBoxes එකක් තෝරන විට අනෙක ඉබේම අයින් වීම
        cbSmellYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbSmellNo.isChecked = false
        }
        cbSmellNo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) cbSmellYes.isChecked = false
        }

        // 5. Save Record Button එක ක්ලික් කළ විට සිදුවන දේ
        btnSaveRecord.setOnClickListener {
            val dateInput = etDate.text.toString().trim()
            val notesInput = etNotes.text.toString().trim()

            // Date එක හිස්ව තබා Save කරන්න හැදුවොත් පණිවිඩයක් පෙන්වීම
            if (dateInput.isEmpty()) {
                Toast.makeText(this, "Please enter a date", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // සාර්ථකව දත්ත ඇතුළත් වූ බවට පණිවිඩයක් පෙන්වීම
            Toast.makeText(this, "Record Saved Successfully!", Toast.LENGTH_LONG).show()
        }
    }
}