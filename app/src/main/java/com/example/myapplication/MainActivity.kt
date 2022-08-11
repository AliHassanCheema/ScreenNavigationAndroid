package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     lateinit var naviBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        naviBtn = findViewById(R.id.navigationBtn)
        naviBtn.setOnClickListener{
            startActivity(Intent(this, SecondActivity ::class.java))
        }
    }
}