package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkinBarrierActivity : AppCompatActivity() {
    private lateinit var backbarrier: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skin_barrier)

        backbarrier = findViewById(R.id.backbarrier)
        backbarrier.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}