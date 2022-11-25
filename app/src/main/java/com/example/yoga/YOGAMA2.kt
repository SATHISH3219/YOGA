package com.example.yoga

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class YOGAMA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogama2)
        supportActionBar?.hide()
        var btn = findViewById<ImageButton>(R.id.imageView15)
        btn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uezgpR1833s"))
            startActivity(i)
        }
    }
}