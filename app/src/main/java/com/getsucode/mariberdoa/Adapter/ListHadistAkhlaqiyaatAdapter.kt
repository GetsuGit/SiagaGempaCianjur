package com.getsucode.mariberdoa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Model.ListModelHadistAkhlaqiyaat
import com.getsucode.mariberdoa.R

class ListHadistAkhlaqiyaatAdapter(private val listHadist: ArrayList<ListModelHadistAkhlaqiyaat>) :
    RecyclerView.Adapter<ListHadistAkhlaqiyaatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadist_akhlaqiyaat, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kontenHadist = listHadist[position]

        holder.tv_ArabicHadistAkhlaqiyaat.text = kontenHadist.arabicHadistAkhlaqiyaat
        holder.tv_LatinHadistAkhlaqiyaat.text = kontenHadist.latinHadistAkhlaqiyaat
        holder.tv_ArtiHadistAkhlaqiyaat.text = kontenHadist.artiHadistAkhlaqiyaat

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

        var tv_ArabicHadistAkhlaqiyaat: TextView = itemView.findViewById(R.id.tv_ArabicHadistAkhlaqiyaat)
        var tv_LatinHadistAkhlaqiyaat: TextView = itemView.findViewById(R.id.tv_LatinHadistAkhlaqiyaat)
        var tv_ArtiHadistAkhlaqiyaat: TextView = itemView.findViewById(R.id.tv_ArtiHadistAkhlaqiyaat)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ListModelHadistAkhlaqiyaat)
    }
}
