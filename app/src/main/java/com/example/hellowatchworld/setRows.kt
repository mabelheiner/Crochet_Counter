package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.hellowatchworld.databinding.ActivityMainBinding

class setRows : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.input)

        var set_row = findViewById<Button>(R.id.set_row)
        var row = findViewById<EditText>(R.id.total_rows).text

        set_row.setOnClickListener {
            Singleton.total_rows = row.toString().toInt()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}