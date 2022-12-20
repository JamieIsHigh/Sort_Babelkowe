package com.barstool.sortbabelkowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val textList = findViewById<TextView>(R.id.before)
    val textSort = findViewById<TextView>(R.id.after)
    val butList = findViewById<Button>(R.id.losuj)
    val butSort = findViewById<Button>(R.id.sortuj)
}