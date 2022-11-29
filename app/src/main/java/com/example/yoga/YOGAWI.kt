package com.example.yoga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAWI : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogawi)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.imageButton5)
        var btn1=findViewById<ImageButton>(R.id.imageButton4)
        var btn2=findViewById<ImageButton>(R.id.imageButton3)
        var btn3=findViewById<ImageButton>(R.id.imageButton6)
        btn.setOnClickListener{
            var x= Intent(this@YOGAWI,YOGAWI1::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAWI,YOGAWI2::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAWI,YOGAWI3::class.java)
            startActivity(y)


            btn3.setOnClickListener{
                var x= Intent(this@YOGAWI,YOGAWI4::class.java)
                startActivity(x)
            }
        }
    }
}