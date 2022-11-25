package com.example.yoga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAM2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogam2)
        supportActionBar?.hide()
        var btn=findViewById<Button>(R.id.button3)
        var btn1=findViewById<Button>(R.id.button4)
            var btn2=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            var x= Intent(this@YOGAM2,YOGAMB::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAM2,YOGAMI::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAM2,YOGAMA::class.java)
            startActivity(y)
    }
}}