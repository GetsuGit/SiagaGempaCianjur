package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListHadistImaniatAdapter
import com.getsucode.mariberdoa.Model.ListModelHadistImaniat
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistImaniat

class ListHadistImaniat : AppCompatActivity() {

    private val title = "Hadis"
    private lateinit var rvListHadist: RecyclerView
    private val list = ArrayList<ListModelHadistImaniat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_hadist_imaniat)

        setActionBarTitle(title)
        rvListHadist= findViewById(R.id.rv_hadist_imaniat)
        rvListHadist.setHasFixedSize(true)

        list.addAll(ItemHadistImaniat.listDataHadistImaniat)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListHadist.layoutManager = LinearLayoutManager(this)
        val listdoa = ListHadistImaniatAdapter(list)
        rvListHadist.adapter = listdoa

        listdoa.setOnItemClickCallback(object: ListHadistImaniatAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListModelHadistImaniat) {
                showSelectedListHadist(data)
            }
        })
    }

    private fun showSelectedListHadist(listmodelhadist: ListModelHadistImaniat) {

        //Toast.makeText(this, "Kamu memilih " + listmodelhadist.ArabicHadistImaniat, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}