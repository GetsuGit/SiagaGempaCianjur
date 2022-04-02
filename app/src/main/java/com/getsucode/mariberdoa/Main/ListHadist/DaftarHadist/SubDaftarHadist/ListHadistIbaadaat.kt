package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListHadistIbaadaatAdapter
import com.getsucode.mariberdoa.Model.ListModelHadistIbaadaat
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistIbaadaat
import com.getsucode.mariberdoa.Repository.ItemHadistImaniat

class ListHadistIbaadaat : AppCompatActivity() {

    private val title = "Hadis"
    private lateinit var rvListHadist: RecyclerView
    private val list = ArrayList<ListModelHadistIbaadaat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_hadist_ibaadaat)

        setActionBarTitle(title)
        rvListHadist= findViewById(R.id.rv_hadist_ibaadaat)
        rvListHadist.setHasFixedSize(true)

        list.addAll(ItemHadistIbaadaat.listDataHadistIbaadaat)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListHadist.layoutManager = LinearLayoutManager(this)
        val listdoa = ListHadistIbaadaatAdapter(list)
        rvListHadist.adapter = listdoa

        listdoa.setOnItemClickCallback(object: ListHadistIbaadaatAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListModelHadistIbaadaat) {
                showSelectedListHadist(data)
            }
        })
    }

    private fun showSelectedListHadist(listmodelhadist: ListModelHadistIbaadaat) {

        //Toast.makeText(this, "Kamu memilih " + listmodelhadist.arabicHadistIbaadaat, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}