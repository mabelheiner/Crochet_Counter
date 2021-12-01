package com.example.hellowatchworld

import android.app.Activity
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.os.Bundle
import com.example.hellowatchworld.databinding.ActivityMainBinding
import android.hardware.SensorManager




class MainActivity : Activity() {
    var total_rows = Singleton.total_rows
    var row = Singleton.row

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rowNumber.text = row.toString()

        binding.addRow.setOnClickListener {
            row = row + 1
            checkRow()
            displayRow()


        }

        binding.minusRow.setOnClickListener {
            row = row - 1
            checkRow()
            displayRow()
        }

    }

    private fun displayRow() {
        binding.rowNumber.text = row.toString()
    }

    private fun checkRow() {

            if (row == (total_rows?.plus(1))) {
                val intent = Intent(this, done::class.java)
                startActivity(intent)
                row = 0
            }

            else if (row == ((total_rows?.div(4)?.times(3)))) {
                val intent = Intent(this, three_quarter::class.java)
                startActivity(intent)
            }

            else if (row == (total_rows?.div(2))) {
                val intent = Intent(this, half::class.java)
                startActivity(intent)
            }

            else if (row == (total_rows?.div(4))) {
                val intent = Intent(this, quarter::class.java)
                startActivity(intent)
            }

        Singleton.row = row
    }
}