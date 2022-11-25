package com.example.yoga

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class YOGAWA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogawa1)
        supportActionBar?.hide()
        var btn = findViewById<Button>(R.id.button5)
        btn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6c3Gka2i9wg"))
            startActivity(i)
        }
    }
}