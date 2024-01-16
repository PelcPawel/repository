package com.example.a3a

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var simpleTV = findViewById<TextView>(R.id.simpleTV)
        simpleTV.text = "Nie"
        var simpleBtn = findViewById<Button>(R.id.simpleBtn)
        simpleBtn.setOnClickListener {
            simpleTV.text= "tak"
        }
        }
    }
