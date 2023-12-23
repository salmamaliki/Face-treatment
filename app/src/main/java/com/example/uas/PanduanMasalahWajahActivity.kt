package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PanduanMasalahWajahActivity : AppCompatActivity() {
    private lateinit var masalahwajah : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_masalah_wajah)

        masalahwajah = findViewById(R.id.masalahwajah)
        masalahwajah.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}