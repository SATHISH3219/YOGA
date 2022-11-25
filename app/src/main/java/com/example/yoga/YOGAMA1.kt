package com.example.yoga

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent

class YOGAMA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogama1)
        supportActionBar?.hide()
        var btn = findViewById<ImageButton>(R.id.imageView14)
        btn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ixfB_S652po"))
            startActivity(i)
        }
    }
}