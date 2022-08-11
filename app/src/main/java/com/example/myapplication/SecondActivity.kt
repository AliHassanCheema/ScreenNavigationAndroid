package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class SecondActivity : AppCompatActivity() {
    private lateinit var secText : TextView
    private lateinit var onSave : Button
    private lateinit var emailAddress : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        secText = findViewById(R.id.secondText)
        onSave = findViewById(R.id.saveBtn)
        emailAddress = findViewById(R.id.emailAddress)
        secText.text = ""

        onSave.setOnClickListener {
            if(emailAddress.text.isEmpty() ) secText.text = "Text Field cant be empty" else secText.text = emailAddress.text
        }

    }
}