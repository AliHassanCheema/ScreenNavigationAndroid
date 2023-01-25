package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import kotlin.math.log

class SecondActivity : AppCompatActivity() {
    private lateinit var emailText : TextView
    private lateinit var nameText : TextView
    private lateinit var onSave : Button
    private lateinit var email : EditText
    private lateinit var name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG", "onCreate: Activity2 Created", )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        emailText = findViewById(R.id.emailText)
        onSave = findViewById(R.id.saveBtn)
        nameText = findViewById(R.id.nameText)
        email = findViewById(R.id.email)
        emailText.text = ""
        name = findViewById(R.id.name)
        nameText.text = intent.getStringExtra("key")


        onSave.setOnClickListener {

            if(email.text.isEmpty() ) {
                emailText.text = "Text Field cant be empty"
            } else {
                emailText.text = email.text
                nameText.text = name.text

                val intent = Intent()
                intent.putExtra("name", "${name.text}")
                intent.putExtra("email", "${email.text}")
                setResult(RESULT_OK, intent)
                onBackPressed()
            }
        }

        onBackPressedDispatcher.addCallback(this /* lifecycle owner */, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
//                val intent = Intent()
//                intent.putExtra("name", "${name.text}")
//                intent.putExtra("email", "${email.text}")
//                setResult(RESULT_OK, intent)
                finish()
                Log.e("TAG", "handleOnBackPressed: Back Pressed", )
               // Back is pressed... Finishing the activity
            }
        })

    }
    override fun onStart() {
        Log.e("TAG", "onStart: Activity2 Started", )
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG", "onResume: Activity2 Resumed", )
        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG", "onPause: Activity2 paused", )
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG", "onStop: Activity2 Stopped", )
        super.onStop()
    }

    override fun onRestart() {
        Log.e("TAG", "onRestart: Activity2 Restarted", )
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("TAG", "onDestroy: Activity2 Destroyed", )
        super.onDestroy()
    }



}