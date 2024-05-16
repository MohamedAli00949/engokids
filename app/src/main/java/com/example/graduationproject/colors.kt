package com.example.graduationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        var backBtn: ImageButton = findViewById(R.id.back_btn)
        backBtn.setOnClickListener {
            onBackPressed()
        }
    }
}