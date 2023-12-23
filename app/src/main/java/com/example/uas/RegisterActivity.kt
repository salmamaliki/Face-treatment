package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var btnregister: Button
    private lateinit var txtlogin : TextView
    private lateinit var backregister : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnregister = findViewById(R.id.btnregister)
        txtlogin = findViewById(R.id.txtlogin)
        backregister = findViewById(R.id.backregister)
        btnregister.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))}
        txtlogin.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))}
        backregister.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))}
    }
}