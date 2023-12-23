package com.example.uas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class LoginActivity : AppCompatActivity() {
    private lateinit var btnlogin: Button
    private lateinit var txtregister : TextView
    private lateinit var back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin = findViewById(R.id.btnlogin)
        txtregister = findViewById(R.id.txtregister)
        back = findViewById(R.id.back)
        btnlogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))}
        txtregister.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))}
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))}


    }
}