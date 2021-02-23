package com.example.application.myapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<View>(R.id.button) as Button
        button!!.setOnClickListener { openActivity2() }
    }

    fun openActivity2() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
}