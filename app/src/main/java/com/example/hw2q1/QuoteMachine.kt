package com.example.hw2q1

import android.annotation.SuppressLint
import kotlin.random.Random

    @SuppressLint("SuspiciousIndentation")
    fun randomQuote (): String {
        val stringArray = arrayOf( // got the quotes from chatGPT
            "You only live once!",
            "Success is not final, failure is not fatal: It is the courage to continue that counts.",
            "The only limit to our realization of tomorrow is our doubts of today.",
            "The purpose of our lives is to be happy.",
            "Life is what happens when you're busy making other plans.",
            "Get busy living or get busy dying.",
            "You have within you right now, everything you need to deal with whatever the world can throw at you.",
            "Believe you can and you're halfway there.",
            "Do not watch the clock. Do what it does. Keep going.",
            "Keep your face always toward the sunshine—and shadows will fall behind you.",
            "It does not matter how slowly you go as long as you do not stop.",
            "Success usually comes to those who are too busy to be looking for it.",
            "Don't be afraid to give up the good to go for the great.",
            "I find that the harder I work, the more luck I seem to have.",
            "Opportunities don't happen, you create them.",
            "I failed my way to success.",
            "Don’t watch the clock; do what it does. Keep going.",
            "The best way to predict your future is to create it.",
            "Dream big and dare to fail.",
            "Your time is limited, don't waste it living someone else's life.",
            "The only way to do great work is to love what you do."
        )
        val quote = Random.nextInt(stringArray.size)
            return stringArray[quote] // returns random quote
    }
