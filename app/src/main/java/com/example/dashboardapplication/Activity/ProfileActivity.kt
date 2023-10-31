package com.example.dashboardapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardapplication.Adapter.TrendsAdapter
import com.example.dashboardapplication.Domain.TrendsDomain
import com.example.dashboardapplication.R
import java.util.ArrayList

class ProfileActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_profile)

                val imageView4: ImageView = findViewById(R.id.imageView4)
                imageView4.setOnClickListener {
                        startActivity(Intent(this, Dashboard_Activity::class.java))
                }
        }
}