package com.example.aquaguardian

import java.io.Serializable

data class WaterIssue(
    val id: String,
    val title: String,
    val location: String,
    val description: String,
    val status: String,
    val imageResId: Int,
) : Serializable