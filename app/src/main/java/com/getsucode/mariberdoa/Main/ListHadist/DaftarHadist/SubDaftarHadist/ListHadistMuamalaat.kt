package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListHadistImaniatAdapter
import com.getsucode.mariberdoa.Adapter.ListHadistMuamalaatAdapter
import com.getsucode.mariberdoa.Model.ListModelHadistImaniat
import com.getsucode.mariberdoa.Model.ListModelHadistMuamalaat
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistImaniat
import com.getsucode.mariberdoa.Repository.ItemHadistMuamalaat

class ListHadistMuamalaat : AppCompatActivity() {

    private val title = "Hadis"
    private lateinit var rvListHadist: RecyclerView
    private val list = ArrayList<ListModelHadistMuamalaat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_hadist_muamalaat)

        setActionBarTitle(title)
        rvListHadist= findViewById(R.id.rv_hadist_muamalaat)
        rvListHadist.setHasFixedSize(true)

        list.addAll(ItemHadistMuamalaat.listDataHadistMuamalaat)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListHadist.layoutManager = LinearLayoutManager(this)
        val listdoa = ListHadistMuamalaatAdapter(list)
        rvListHadist.adapter = listdoa

        listdoa.setOnItemClickCallback(object: ListHadistMuamalaatAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListModelHadistMuamalaat) {
                showSelectedListHadist(data)
            }
        })
    }

    private fun showSelectedListHadist(listmodelhadist: ListModelHadistMuamalaat) {

        //Toast.makeText(this, "Kamu memilih " + listmodelhadist.arabicHadistMuamalaat, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

}