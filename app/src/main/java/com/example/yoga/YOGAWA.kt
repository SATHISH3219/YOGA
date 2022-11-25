package com.example.yoga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAWA : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogawa)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.imageView6)
        var btn1=findViewById<ImageButton>(R.id.imageView7)
        var btn2=findViewById<ImageButton>(R.id.imageView8)
        var btn3=findViewById<ImageButton>(R.id.imageView9)
        btn.setOnClickListener{
            var x= Intent(this@YOGAWA,YOGAWA1::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAWA,YOGAWA2::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAWA,YOGAWA3::class.java)
            startActivity(y)


            btn3.setOnClickListener{
                var x= Intent(this@YOGAWA,YOGAWA4::class.java)
                startActivity(x)
            }
        }
    }}
