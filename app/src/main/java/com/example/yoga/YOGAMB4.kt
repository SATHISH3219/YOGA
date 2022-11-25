package com.example.yoga

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class YOGAMB4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogamb4)
        supportActionBar?.hide()
        var btn = findViewById<ImageButton>(R.id.imageView12)
        btn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QAX6Sx5zGz8"))
            startActivity(i)
        }
    }
}