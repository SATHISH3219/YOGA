package com.example.yoga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAMB : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogamb)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.imageView2)
        var btn1=findViewById<ImageButton>(R.id.imageView3)
        var btn2=findViewById<ImageButton>(R.id.imageView4)
        var btn3=findViewById<ImageButton>(R.id.imageView5)
        btn.setOnClickListener{
            var x= Intent(this@YOGAMB,YOGAMB1::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAMB,YOGAMB2::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAMB,YOGAMB3::class.java)
            startActivity(y)


            btn3.setOnClickListener{
                var x= Intent(this@YOGAMB,YOGAMB4::class.java)
                startActivity(x)
            }
        }
    }}
