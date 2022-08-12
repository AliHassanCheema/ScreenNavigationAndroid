package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     private lateinit var naviBtn : Button
     private lateinit var userName: TextView
     private lateinit var email: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        naviBtn = findViewById(R.id.navigationBtn)
        userName = findViewById(R.id.userName)
        email = findViewById(R.id.email)
        val uName = intent.getStringExtra("uname")
        val uEmail = intent.getStringExtra("uemail")
        if (uName == null){
            userName.text =  "Name : Name will be shown here"
            email.text = "Email : Email will be shown here"
        }else{
            userName.text =  "Name : $uName"
            email.text = "Email : $uEmail"
        }

        naviBtn.setOnClickListener{
            startActivity(Intent(this, SecondActivity ::class.java))
        }
    }
}