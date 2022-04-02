package com.getsucode.mariberdoa.Main.ListDoa

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListDoaAdapter
import com.getsucode.mariberdoa.Main.ListDoa.DetailDoa.DetailDoa
import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemDoa

class ListDoa : AppCompatActivity() {

    private var title = "Doa"
    private lateinit var rvListDoa: RecyclerView
    private val list = ArrayList<ListModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_doa)

        setActionBarTitle(title)

        rvListDoa= findViewById(R.id.rv_doa)
        rvListDoa.setHasFixedSize(true)

        list.addAll(ItemDoa.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListDoa.layoutManager = LinearLayoutManager(this)
        val listdoa = ListDoaAdapter(list)
        rvListDoa.adapter = listdoa

        listdoa.setOnItemClickCallback(object: ListDoaAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListModel) {
               showSelectedListDoa(data)
            }
        })
    }

    private fun showSelectedListDoa(listmodel: ListModel) {

            val detailDoa = Intent(this, DetailDoa::class.java )

            detailDoa.putExtra("intent_title",listmodel.title)
            detailDoa.putExtra("intent_arabic",listmodel.arabic)
            detailDoa.putExtra("intent_latin",listmodel.latin)
            detailDoa.putExtra("intent_translation",listmodel.translation)
            startActivity(detailDoa)

        //Toast.makeText(this, "Kamu memilih" + title, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}