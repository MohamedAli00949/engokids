package com.example.graduationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)

        var lettersBtn: LinearLayout = findViewById(R.id.letters)
        lettersBtn.setOnClickListener {
            val intent = Intent(this, letters::class.java)
            startActivity(intent)
        }

        var colorsBtn: LinearLayout = findViewById(R.id.colors)
        colorsBtn.setOnClickListener {
            val intent = Intent(this, colors::class.java)
            startActivity(intent)
        }

//        var bodyBtn: LinearLayout = findViewById(R.id.body)
//        bodyBtn.setOnClickListener {
//            val intent = Intent(this, body::class.java)
//            startActivity(intent)
//        }

        var numbersBtn: LinearLayout = findViewById(R.id.numbers)
        numbersBtn.setOnClickListener {
            val intent = Intent(this, numbers::class.java)
            startActivity(intent)
        }

        var foodBtn: LinearLayout = findViewById(R.id.food)
        foodBtn.setOnClickListener {
            val intent = Intent(this, food::class.java)
            startActivity(intent)
        }
//
//        var animalsBtn: LinearLayout = findViewById(R.id.animals)
//        animalsBtn.setOnClickListener {
//            val intent = Intent(this, animals::class.java)
//            startActivity(intent)
//        }
    }
}