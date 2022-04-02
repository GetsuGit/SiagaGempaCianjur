package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Model.ListModelHadistMuamalaat
import com.getsucode.mariberdoa.R

class ListHadistMuamalaatAdapter(private val listHadist: ArrayList<ListModelHadistMuamalaat>) :
    RecyclerView.Adapter<ListHadistMuamalaatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadist_muamalaat, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenHadist = listHadist[position]

        holder.tv_ArabicHadistMuamalaat.text = kontenHadist.arabicHadistMuamalaat
        holder.tv_LatinHadistMuamalaat.text = kontenHadist.latinHadistMuamalaat
        holder.tv_ArtiHadistMuamalaat.text = kontenHadist.artiHadistMuamalaat

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

        var tv_ArabicHadistMuamalaat: TextView = itemView.findViewById(R.id.tv_ArabicHadistMuamalaat)
        var tv_LatinHadistMuamalaat: TextView = itemView.findViewById(R.id.tv_LatinHadistMuamalaat)
        var tv_ArtiHadistMuamalaat: TextView = itemView.findViewById(R.id.tv_ArtiHadistMuamalaat)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModelHadistMuamalaat)
    }
}
