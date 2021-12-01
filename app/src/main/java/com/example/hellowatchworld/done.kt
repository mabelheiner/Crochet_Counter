package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.hellowatchworld.databinding.ActivityMainBinding

class done : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.done)

        var home = findViewById<Button>(R.id.again)

        home.setOnClickListener {
            val intent = Intent(this, setRows::class.java)
            startActivity(intent)
        }
    }

}