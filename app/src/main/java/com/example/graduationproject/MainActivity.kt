package com.example.graduationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.start_learning)
        button.setOnClickListener {
            val intent = Intent(this, ScreenTwo::class.java)
            startActivity(intent)
        }
    }
}