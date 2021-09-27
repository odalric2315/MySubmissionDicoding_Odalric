package com.percobaan.mysubmissiondicoding_odalric

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@Suppress("DEPRECATION")
class ListCountryAdapter(val listCountry: ArrayList<Country>) :
    RecyclerView.Adapter<ListCountryAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val country = listCountry[position]

        Glide.with(holder.itemView.context)
            .load(country.photo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgPhoto)

        holder.tvCountry.text = country.name
        holder.tvDetail.text = country.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCountry[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listCountry.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCountry: TextView = itemView.findViewById(R.id.tv_itemname)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_itemcountry)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Country)
    }
}