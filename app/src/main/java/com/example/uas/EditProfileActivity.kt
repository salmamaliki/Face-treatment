package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EditProfileActivity : AppCompatActivity() {
    private lateinit var btnupdate : Button
    private lateinit var backupdate : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        btnupdate = findViewById(R.id.btnupdate)
        btnupdate.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        backupdate = findViewById(R.id.backupdate)
        backupdate.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}