package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PanduanSkincareActivity : AppCompatActivity() {
    private lateinit var backskincare : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_skincare)

        backskincare = findViewById(R.id.backskincare)
        backskincare.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
}