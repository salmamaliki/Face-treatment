package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PanduanSiklusKulitActivity : AppCompatActivity() {
    private lateinit var backsiklus : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_siklus_kulit)

        backsiklus = findViewById(R.id.backsiklus)
        backsiklus.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}