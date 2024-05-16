package com.example.graduationproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

data class AlphabetExample(val letter: String, val example: String, val icon: Int)

class letters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letters)

        val backBtn: ImageButton = findViewById(R.id.back_btn)
        backBtn.setOnClickListener {
            onBackPressed()
        }

        val alphabetExamples = listOf(
            AlphabetExample("a", "apple", R.drawable.apple),
            AlphabetExample("b", "ball", R.drawable.ball),
            AlphabetExample("c", "cat", R.drawable.cat),
            AlphabetExample("d", "dog", R.drawable.dog),
            AlphabetExample("e", "elephant", R.drawable.elephant),
            AlphabetExample("f", "fish", R.drawable.fish),
            AlphabetExample("g", "guitar", R.drawable.guitar),
            AlphabetExample("h", "hat", R.drawable.hat),
            AlphabetExample("i", "ice cream", R.drawable.ice_cream),
            AlphabetExample("j", "jump", R.drawable.jump),
            AlphabetExample("k", "kite", R.drawable.kite),
            AlphabetExample("l", "lion", R.drawable.lion),
            AlphabetExample("m", "monkey", R.drawable.monkey),
            AlphabetExample("n", "nest", R.drawable.nest),
            AlphabetExample("o", "orange", R.drawable.orange),
            AlphabetExample("p", "penguin", R.drawable.penguin),
            AlphabetExample("q", "queen", R.drawable.queen),
            AlphabetExample("r", "rabbit", R.drawable.rabbit),
            AlphabetExample("s", "sun", R.drawable.sun),
            AlphabetExample("t", "tiger", R.drawable.tiger),
            AlphabetExample("u", "umbrella", R.drawable.umbrella),
            AlphabetExample("v", "violin", R.drawable.violin),
            AlphabetExample("w", "whale", R.drawable.whale),
            AlphabetExample("x", "xylophone", R.drawable.xylophone),
            AlphabetExample("y", "yoyo", R.drawable.yoyo),
            AlphabetExample("z", "zebra", R.drawable.zebra)
        )

        val buttonContainer = findViewById<LinearLayout>(R.id.side_bar_content)
        for (i in 0 until buttonContainer.childCount) {
            val childView = buttonContainer.getChildAt(i)
            if (childView is Button) {
                val button: Button = childView
                button.setOnClickListener {
                    val letterData = alphabetExamples.find{ it.letter == button.text }

                    val letter_icon:ImageView = findViewById(R.id.letter_icon)
                    val letter_cap_small: TextView = findViewById(R.id.letter_cap_small)
                    val letter_cap: TextView = findViewById(R.id.letter_cap)
                    val letter_word: TextView = findViewById(R.id.letter_word)

                    if (letterData != null) {
                        val imageDrawable = getDrawable(letterData.icon)
                        letter_icon.setImageDrawable(imageDrawable)
                        letter_cap.text = letterData.letter.uppercase()
                        letter_cap_small.text = letterData.letter.uppercase() + letterData.letter.lowercase()
                        letter_word.text = letterData.example.substring(1)
                    }
                }
            }
        }

    }
}