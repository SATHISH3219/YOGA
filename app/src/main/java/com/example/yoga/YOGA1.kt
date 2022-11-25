package com.example.yoga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
public class YOGA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga1)
        supportActionBar?.hide()
        var btn=findViewById<ImageButton>(R.id.imageButton)
        var btn1=findViewById<ImageButton>(R.id.imageButton2)
btn.setOnClickListener{
    var x=Intent(this@YOGA1,YOGAM2::class.java)
    startActivity(x)
    }
        btn1.setOnClickListener {
            var y = Intent(this@YOGA1,YOGAW2::class.java)
            startActivity(y)
        }








    }
}