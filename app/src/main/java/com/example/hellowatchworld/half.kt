package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.hellowatchworld.databinding.ActivityMainBinding

class half : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.half)

        var home = findViewById<TextView>(R.id.half)

        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}