package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    private lateinit var backkehome : ImageView
    private lateinit var btnlogout : Button
    private lateinit var btnedit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        backkehome = findViewById(R.id.backkehome)
        backkehome.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        btnlogout = findViewById(R.id.btnlogout)
        btnlogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnedit = findViewById(R.id.btnedit)
        btnedit.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
    }
}