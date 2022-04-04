package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListHadistAkhlaqiyaatAdapter
import com.getsucode.mariberdoa.Adapter.ListHadistMuasyaraatAdapter
import com.getsucode.mariberdoa.Model.ListModelHadistAkhlaqiyaat
import com.getsucode.mariberdoa.Model.ListModelHadistMuasyaraat
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistAkhlaqiyaat
import com.getsucode.mariberdoa.Repository.ItemHadistMuasyaraat

class ListHadistAkhlaqiyaat : AppCompatActivity() {

    private val title = "Hadis"
    private lateinit var rvListHadist: RecyclerView
    private val list = ArrayList<ListModelHadistAkhlaqiyaat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_hadist_akhlaqiyaat)

        setActionBarTitle(title)
        rvListHadist = findViewById(R.id.rv_hadist_akhlaqiyaat)
        rvListHadist.setHasFixedSize(true)

        list.addAll(ItemHadistAkhlaqiyaat.listDataHadistAkhlaqiyaat)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvListHadist.layoutManager = LinearLayoutManager(this)
        val listdoa = ListHadistAkhlaqiyaatAdapter(list)
        rvListHadist.adapter = listdoa

        listdoa.setOnItemClickCallback(object : ListHadistAkhlaqiyaatAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ListModelHadistAkhlaqiyaat) {
                showSelectedListHadist(data)
            }
        })
    }

    private fun showSelectedListHadist(listmodelhadist: ListModelHadistAkhlaqiyaat) {

        //Toast.makeText(this, "Kamu memilih " + listmodelhadist.arabicHadistAkhlaqiyaat, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}