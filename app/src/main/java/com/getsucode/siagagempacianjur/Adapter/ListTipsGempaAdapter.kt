package com.getsucode.siagagempacianjur.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.siagagempacianjur.R
import com.getsucode.siagagempacianjur.Model.ListModel


class ListTipsGempaAdapter(private val listTips: ArrayList<ListModel>) :
    RecyclerView.Adapter<ListTipsGempaAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_tips_gempa, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val konten = listTips[position]

        holder.tvJudul.text = konten.judulTips
        holder.tvPenjelasan.text = konten.penjelasanTips


        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listTips[holder.absoluteAdapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listTips.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tvJudul: TextView = itemView.findViewById(R.id.tv_Judul)
        var tvPenjelasan: TextView = itemView.findViewById(R.id.tv_Penjelasan)


    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModel)
    }
}
