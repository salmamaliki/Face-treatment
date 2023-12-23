package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView

class AcneActivity : AppCompatActivity() {
    private lateinit var backacne : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acne)
        backacne = findViewById(R.id.backacne)
        backacne.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
}