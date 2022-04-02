package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Model.ListModelHadistMuasyaraat
import com.getsucode.mariberdoa.R

class ListHadistMuasyaraatAdapter(private val listHadist: ArrayList<ListModelHadistMuasyaraat>) :
    RecyclerView.Adapter<ListHadistMuasyaraatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadist_muasyaraat, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenHadist = listHadist[position]

        holder.tv_ArabicHadistMuasyaraat.text = kontenHadist.arabicHadistMuasyaraat
        holder.tv_LatinHadistMuasyaraat.text = kontenHadist.latinHadistMuasyaraat
        holder.tv_ArtiHadistMuasyaraat.text = kontenHadist.artiHadistMuasyaraat

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

        var tv_ArabicHadistMuasyaraat: TextView = itemView.findViewById(R.id.tv_ArabicHadistMuasyaraat)
        var tv_LatinHadistMuasyaraat: TextView = itemView.findViewById(R.id.tv_LatinHadistMuasyaraat)
        var tv_ArtiHadistMuasyaraat: TextView = itemView.findViewById(R.id.tv_ArtiHadistMuasyaraat)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModelHadistMuasyaraat)
    }
}
