package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class SecondActivity : AppCompatActivity() {
    private lateinit var email : TextView
    private lateinit var nameText : TextView
    private lateinit var onSave : Button
    private lateinit var emailAddress : EditText
    private lateinit var name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        email = findViewById(R.id.secondText)
        onSave = findViewById(R.id.saveBtn)
        nameText = findViewById(R.id.nameText)
        emailAddress = findViewById(R.id.emailAddress)
        email.text = ""
        name = findViewById(R.id.name)
        nameText.text = ""


        onSave.setOnClickListener {
            if(emailAddress.text.isEmpty() ) {
                email.text = "Text Field cant be empty"
            } else {
                email.text = emailAddress.text
                nameText.text = name.text
            }
        }

    }
}