package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Model.ListModelHadistImaniat
import com.getsucode.mariberdoa.R

class ListHadistImaniatAdapter(private val listHadist: ArrayList<ListModelHadistImaniat>) :
    RecyclerView.Adapter<ListHadistImaniatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadist_imaniat, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenHadist = listHadist[position]

        holder.tv_ArabicHadist.text = kontenHadist.ArabicHadistImaniat
        holder.tv_LatinHadist.text = kontenHadist.LatinHadistImaniat
        holder.tv_ArtiHadist.text = kontenHadist.ArtiHadistImaniat

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listHadist[holder.absoluteAdapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listHadist.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tv_ArabicHadist: TextView = itemView.findViewById(R.id.tv_ArabicHadist)
        var tv_LatinHadist: TextView = itemView.findViewById(R.id.tv_LatinHadist)
        var tv_ArtiHadist: TextView = itemView.findViewById(R.id.tv_ArtiHadist)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModelHadistImaniat)
    }
}
