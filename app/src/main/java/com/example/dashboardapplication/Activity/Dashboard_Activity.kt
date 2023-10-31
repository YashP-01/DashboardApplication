package com.example.dashboardapplication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardapplication.Adapter.TrendsAdapter
import com.example.dashboardapplication.Domain.TrendsDomain
import com.example.dashboardapplication.R

class Dashboard_Activity : AppCompatActivity() {
    val dataList = ArrayList<TrendsDomain>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val profileBtn: LinearLayout = findViewById(R.id.profileBtn)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        profileBtn.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        dataList.add(
            TrendsDomain(
                "Future in AI, What will tomorrow be like?",
                "The National",
                R.drawable.trends
            )
        )
        dataList.add(
            TrendsDomain(
                "Important points in concluding a work contract",
                "Reuters",
                R.drawable.trends2
            )
        )
        dataList.add(
            TrendsDomain(
                "Future in AI, What will tomorrow be like?",
                "The National",
                R.drawable.trends
            )
        )

        val adapter = TrendsAdapter(dataList)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.adapter = adapter
    }
}