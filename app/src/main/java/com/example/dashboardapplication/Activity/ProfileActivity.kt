package com.example.dashboardapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardapplication.Adapter.TrendsAdapter
import com.example.dashboardapplication.Domain.TrendsDomain
import com.example.dashboardapplication.R
import java.util.ArrayList

class ProfileActivity : AppCompatActivity() {
private lateinit var adapterTrendsList: RecyclerView.Adapter<*>
private lateinit var recyclerViewTrends: RecyclerView

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        bottomNavigation()
        }

private fun bottomNavigation() {
        val profileBtn: LinearLayout = findViewById(R.id.profileBtn)
        profileBtn.setOnClickListener {
        startActivity(Intent(this@ProfileActivity, ProfileActivity::class.java))
        }
        }

@Suppress("WrongViewCast")
private fun initRecyclerView() {
        val items = ArrayList<TrendsDomain>()

        items.add(TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends"))
        items.add(TrendsDomain("Important points in concluding a work contract", "Reuters", "trends2"))
        items.add(TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends"))

        recyclerViewTrends = findViewById(R.id.view1)
        recyclerViewTrends.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        adapterTrendsList = TrendsAdapter(items)
        recyclerViewTrends.adapter = adapterTrendsList
        }
        }
