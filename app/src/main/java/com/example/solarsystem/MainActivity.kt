package com.example.solarsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val sunBtn: Button = findViewById(R.id.sunBtn)
        val mercuryBtn: Button = findViewById(R.id.mercuryBtn)
        val venusBtn: Button = findViewById(R.id.venusBtn)
        val earthBtn: Button = findViewById(R.id.earthBtn)
        val marsBtn: Button = findViewById(R.id.marsBtn)
        val jupiterBtn: Button = findViewById(R.id.jupiterBtn)
        val saturnBtn: Button = findViewById(R.id.saturnBtn)
        val uranusBtn: Button = findViewById(R.id.uranusBtn)
        val neptuneBtn: Button = findViewById(R.id.neptuneBtn)
        val plutoBtn: Button = findViewById(R.id.plutonBtn)

        sunBtn.setOnClickListener {
            startActivity(Intent(this, Sun::class.java))
        }

        mercuryBtn.setOnClickListener {
            startActivity(Intent(this, Mercury::class.java))
        }

        venusBtn.setOnClickListener {
            startActivity(Intent(this, Venus::class.java))
        }

        earthBtn.setOnClickListener {
            startActivity(Intent(this, Earth::class.java))
        }

        marsBtn.setOnClickListener {
            startActivity(Intent(this, Mars::class.java))
        }

        jupiterBtn.setOnClickListener {
            startActivity(Intent(this, Jupiter::class.java))
        }

        saturnBtn.setOnClickListener {
            startActivity(Intent(this, Saturn::class.java))
        }

        uranusBtn.setOnClickListener {
            startActivity(Intent(this, Uranus::class.java))
        }

        neptuneBtn.setOnClickListener {
            startActivity(Intent(this, Neptune::class.java))
        }

        plutoBtn.setOnClickListener {
            startActivity(Intent(this, Pluton::class.java))
        }


    }
}