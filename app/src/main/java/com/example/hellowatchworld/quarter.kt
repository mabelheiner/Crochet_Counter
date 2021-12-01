package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.hellowatchworld.databinding.ActivityMainBinding

class quarter : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.quarter)

        var home = findViewById<TextView>(R.id.quarter)

        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}