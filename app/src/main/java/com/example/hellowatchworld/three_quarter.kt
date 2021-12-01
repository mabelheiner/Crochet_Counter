package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.hellowatchworld.databinding.ActivityMainBinding

class three_quarter : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.three_quarter)

        var home = findViewById<TextView>(R.id.three_quarter)

        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}