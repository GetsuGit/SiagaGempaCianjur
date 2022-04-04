package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Model.ListModelHadistIbaadaat
import com.getsucode.mariberdoa.R

class ListHadistIbaadaatAdapter(private val listHadist: ArrayList<ListModelHadistIbaadaat>) :
    RecyclerView.Adapter<ListHadistIbaadaatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_hadist_ibaadaat, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenHadist = listHadist[position]

        holder.tv_ArabicHadistIbaadaat.text = kontenHadist.arabicHadistIbaadaat
        holder.tv_LatinHadistIbaadaat.text = kontenHadist.latinHadistIbaadaat
        holder.tv_ArtiHadistIbaadaat.text = kontenHadist.artiHadistIbaadaat

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

        var tv_ArabicHadistIbaadaat: TextView = itemView.findViewById(R.id.tv_ArabicHadistIbaadaat)
        var tv_LatinHadistIbaadaat: TextView = itemView.findViewById(R.id.tv_LatinHadistIbaadaat)
        var tv_ArtiHadistIbaadaat: TextView = itemView.findViewById(R.id.tv_ArtiHadistIbaadaat)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModelHadistIbaadaat)
    }
}
