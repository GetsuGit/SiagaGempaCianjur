package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.getsucode.mariberdoa.Model.ListQuotesMuslimModel
import com.getsucode.mariberdoa.R

class ListQuotesMuslimAdapter(private val listDoaDoa: ArrayList<ListQuotesMuslimModel>) :
    RecyclerView.Adapter<ListQuotesMuslimAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_quotesmuslim, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenQuotesMuslim = listDoaDoa[position]

        Glide.with(holder.itemView.context)
            .load(kontenQuotesMuslim.imageQuotesMuslim)
            .apply(RequestOptions().override(400, 400))
            .into(holder.tv_ImgQoutesMuslim)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDoaDoa[holder.absoluteAdapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listDoaDoa.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tv_ImgQoutesMuslim: ImageView = itemView.findViewById(R.id.img_quotesmuslim)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListQuotesMuslimModel)
    }
}
