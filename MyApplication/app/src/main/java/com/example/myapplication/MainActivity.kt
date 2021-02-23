package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.RollButton)
        val rTextView = findViewById<TextView>(R.id.rTextView)
        val seekBar= findViewById<SeekBar>(R.id.spread)

        rollButton.setOnClickListener {

            val rand = Random().nextInt(seekBar.progress)
            rTextView.text = rand.toString()

        }

    }


}