package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Main.ListDoa.ListDoa
import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.R

class ListDoaAdapter(private val listDoaDoa: ArrayList<ListModel>) :
    RecyclerView.Adapter<ListDoaAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_doa, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenDoa = listDoaDoa[position]

        holder.tvJudul.text = kontenDoa.title
        holder.tvArabic.text = kontenDoa.arabic
        holder.tvLatin.text = kontenDoa.latin
        holder.tvArti.text = kontenDoa.translation

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

        var tvJudul: TextView = itemView.findViewById(R.id.tv_JudulDoa)
        var tvArabic: TextView = itemView.findViewById(R.id.tv_Arabic)
        var tvLatin: TextView = itemView.findViewById(R.id.tv_Latin)
        var tvArti: TextView = itemView.findViewById(R.id.tv_Arti)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModel)
    }
}
