package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     private lateinit var naviBtn : Button
     private lateinit var userName: TextView
     private lateinit var email: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG", "onCreate: Activity1 Created")
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
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
//            startActivityForResult(intent, 1)

        }
    }

    override fun onStart() {
        Log.e("TAG", "onStart: Activity1 Started", )
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG", "onResume: Activity1 Resumed", )
        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG", "onPause: Activity1 paused", )
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG", "onStop: Activity1 Stopped", )
        super.onStop()
    }

    override fun onRestart() {
        Log.e("TAG", "onRestart: Activity1 Restarted", )
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("TAG", "onDestroy: Activity1 Destroyed", )
        super.onDestroy()
    }

    override fun startActivity(intent: Intent?) {

        super.startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
             userName.text = "Name: ${data!!.getStringExtra("name")}"
            email.text = "Email: ${data!!.getStringExtra("email")}"
        }else{
            Log.e("TAG", "onActivityResult: Null Value returned", )
        }
    }


}