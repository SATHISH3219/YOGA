package com.example.yoga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAW2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogaw3)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.button3)
        var btn1=findViewById<ImageButton>(R.id.button4)
        var btn2=findViewById<ImageButton>(R.id.button)
        btn.setOnClickListener{
            var x= Intent(this@YOGAW2,YOGAWB::class.java)
            startActivity(x)
        }
        btn1.setOnClickListener {
            var y = Intent(this@YOGAW2,YOGAWI::class.java)
            startActivity(y)
        }
        btn2.setOnClickListener {
            var y = Intent(this@YOGAW2,YOGAWA::class.java)
            startActivity(y)
        }
    }
}