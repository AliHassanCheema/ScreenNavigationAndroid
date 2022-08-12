package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class SecondActivity : AppCompatActivity() {
    private lateinit var emailText : TextView
    private lateinit var nameText : TextView
    private lateinit var onSave : Button
    private lateinit var email : EditText
    private lateinit var name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        emailText = findViewById(R.id.emailText)
        onSave = findViewById(R.id.saveBtn)
        nameText = findViewById(R.id.nameText)
        email = findViewById(R.id.email)
        emailText.text = ""
        name = findViewById(R.id.name)
        nameText.text = ""


        onSave.setOnClickListener {
            if(email.text.isEmpty() ) {
                emailText.text = "Text Field cant be empty"
            } else {
                emailText.text = email.text
                nameText.text = name.text
                    startActivity(Intent(this, MainActivity ::class.java).putExtra("uname", name.text.toString()).putExtra("uemail", email.text.toString())

                )
            }
        }

    }
}