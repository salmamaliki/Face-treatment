package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MencerahkanActivity : AppCompatActivity() {
    private lateinit var backbrightening : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mencerahkan)

        backbrightening = findViewById(R.id.backbrightening)
        backbrightening.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}