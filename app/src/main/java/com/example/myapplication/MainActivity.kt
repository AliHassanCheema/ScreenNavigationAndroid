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
            val intent = Intent(this, SecondActivity ::class.java)
            intent.putExtra("name", "name")
            intent.putExtra("email", "name")
            startActivityForResult(intent, 1)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
             userName.text = "Name: ${data!!.getStringExtra("name")}"
            email.text = "Email: ${data!!.getStringExtra("email")}"
        }
    }
}