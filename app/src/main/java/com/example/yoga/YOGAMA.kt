package com.example.yoga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAMA : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogama)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.imageButton5)
        var btn1=findViewById<ImageButton>(R.id.imageButton4)
        var btn2=findViewById<ImageButton>(R.id.imageButton3)
        var btn3=findViewById<ImageButton>(R.id.imageButton6)
        btn.setOnClickListener{
            var x= Intent(this@YOGAMA,YOGAMA1::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAMA,YOGAMA2::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAMA,YOGAMA3::class.java)
            startActivity(y)


            btn3.setOnClickListener{
                var x= Intent(this@YOGAMA,YOGAMA4::class.java)
                startActivity(x)
            }
    }
}}