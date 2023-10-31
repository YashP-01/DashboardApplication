package com.example.dashboardapplication.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.dashboardapplication.R

class MainActivity : AppCompatActivity() {
        private lateinit var introBtn: AppCompatButton

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                introBtn = findViewById(R.id.introBtn)

                introBtn.setOnClickListener {
                        startActivity(Intent(this, Dashboard_Activity::class.java))
                }
        }
}
