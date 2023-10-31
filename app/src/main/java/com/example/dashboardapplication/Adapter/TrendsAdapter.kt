package com.example.dashboardapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
import com.example.dashboardapplication.Domain.TrendsDomain
import com.example.dashboardapplication.R

class TrendsAdapter(private val items: ArrayList<TrendsDomain>) : RecyclerView.Adapter<TrendsAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.viewholder_trend_list, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]

        holder.title.text = currentItem.title
        holder.subtitle.text = currentItem.subtitle

        val drawableResourceId = holder.itemView.resources.getIdentifier(
            currentItem.picAddress,
            "drawable",
            holder.itemView.context.packageName
        )

        Glide.with(holder.itemView.context)
            .load(drawableResourceId)
            .transform(GranularRoundedCorners(30f,30f,0f,0f))
            .into(holder.pic)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val subtitle: TextView = itemView.findViewById(R.id.subtitletxt)
        val pic: ImageView = itemView.findViewById(R.id.pic)
    }
}
