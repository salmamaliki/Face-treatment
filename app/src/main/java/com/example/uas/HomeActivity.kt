package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var btn_profile: ImageView
    private lateinit var btn1home1 : TextView
    private lateinit var btn2home1 : TextView
    private lateinit var btn3home1 : TextView
    private lateinit var btn4home1 : TextView
    private lateinit var btn5home1 : TextView
    private lateinit var btn6home1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_profile = findViewById(R.id.btn_profile)
        btn_profile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))}

        btn1home1 = findViewById(R.id.btn1home1)
        btn1home1.setOnClickListener {
            startActivity(Intent(this, PanduanSiklusKulitActivity::class.java))
        }
        btn3home1 = findViewById(R.id.btn3home1)
        btn3home1.setOnClickListener {
            startActivity(Intent(this, PanduanSkincareActivity::class.java))
        }

        btn2home1 = findViewById(R.id.btn2home1)
        btn2home1.setOnClickListener {
            startActivity(Intent(this, PanduanMasalahWajahActivity::class.java))
        }

        btn4home1 = findViewById(R.id.btn4home1)
        btn4home1.setOnClickListener {
            startActivity(Intent(this, AcneActivity::class.java))
        }

        btn5home1 = findViewById(R.id.btn5home1)
        btn5home1.setOnClickListener {
            startActivity(Intent(this, SkinBarrierActivity::class.java))
        }

        btn6home1 = findViewById(R.id.btn6home1)
        btn6home1.setOnClickListener {
            startActivity(Intent(this, MencerahkanActivity::class.java))
        }

    }
}
