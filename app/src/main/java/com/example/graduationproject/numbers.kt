package com.example.graduationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.ceil

data class NumberExample(val letter: String, val name: String, val icon: Int, val fruit: Int)

class numbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        var backBtn: ImageButton = findViewById(R.id.back_btn)
        backBtn.setOnClickListener {
            onBackPressed()
        }

        val numbersExamples = listOf(
            NumberExample("1", "one", R.drawable.one, R.drawable.sun),
            NumberExample("2", "two", R.drawable.two, R.drawable.apple),
            NumberExample("3", "three", R.drawable.three, R.drawable.orange),
            NumberExample("4", "four", R.drawable.four, R.drawable.tomato),
            NumberExample("5", "five", R.drawable.five, R.drawable.broccoli),
            NumberExample("6", "six", R.drawable.six, R.drawable.strawberry),
            NumberExample("7", "seven", R.drawable.seven, R.drawable.spinach),
            NumberExample("8", "eight", R.drawable.eight, R.drawable.carrot),
            NumberExample("9", "nine", R.drawable.nine, R.drawable.grapes),
            NumberExample("10", "ten", R.drawable.ten, R.drawable.kite),
        )

        val buttonContainer = findViewById<LinearLayout>(R.id.side_bar_content)
        for (i in 0 until buttonContainer.childCount) {
            val childView = buttonContainer.getChildAt(i)
            if (childView is Button) {
                val button: Button = childView
                button.setOnClickListener {
                    var letterData = numbersExamples.find{ it.letter == button.text }

                    var letter_icon: ImageView = findViewById(R.id.letter_icon)
                    var letter_word: TextView = findViewById(R.id.letter_word)
                    var numbersContainer: LinearLayout = findViewById(R.id.numbers)

                    if (letterData != null) {
                        var imageDrawable = getDrawable(letterData.icon)
                        letter_icon.setImageDrawable(imageDrawable)
                        letter_word.text = letterData.name
                        var number = letterData.letter.toInt()

                        numbersContainer.removeAllViews()

                        var currentRow = 0
                        var maxItemsPerRow = 3
//                        var maxRows = ceil((number / maxItemsPerRow).toDouble()).toInt()
                        var maxRows = (number + maxItemsPerRow - 1) / maxItemsPerRow
                        for (i in 0 until maxRows) {
                            val newRow = LinearLayout(this)
                            newRow.orientation = LinearLayout.HORIZONTAL

                            // add images to the current row
                            for (j in 0 until maxItemsPerRow) {
                                val imageIndex = j + (i * maxItemsPerRow)
                                if (imageIndex >= number) break

                                val image = ImageView(this)
                                image.setImageResource(letterData.fruit)

                                image.layoutParams = LinearLayout.LayoutParams(300, 300)
                                image.scaleType = ImageView.ScaleType.CENTER_INSIDE

                                newRow.addView(image)
                            }

                            currentRow++
                            numbersContainer.addView(newRow)  // Add the completed row to the main container
                        }
                    }
                }
            }
        }
    }
}