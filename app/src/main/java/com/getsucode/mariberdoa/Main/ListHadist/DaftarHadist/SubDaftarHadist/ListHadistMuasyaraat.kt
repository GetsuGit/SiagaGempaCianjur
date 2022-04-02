package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListHadistMuasyaraatAdapter
import com.getsucode.mariberdoa.Model.ListModelHadistMuasyaraat
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistMuasyaraat

class ListHadistMuasyaraat : AppCompatActivity() {

    private val title = "Hadist"
    private lateinit var rvListHadist: RecyclerView
    private val list = ArrayList<ListModelHadistMuasyaraat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_list_hadist_muasyaraat)

        setActionBarTitle(title)
        rvListHadist= findViewById(R.id.rv_hadist_muasyaraat)
        rvListHadist.setHasFixedSize(true)

        list.addAll(ItemHadistMuasyaraat.listDataHadistMuasyaraat)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvListHadist.layoutManager = LinearLayoutManager(this)
        val listdoa = ListHadistMuasyaraatAdapter(list)
        rvListHadist.adapter = listdoa

        listdoa.setOnItemClickCallback(object: ListHadistMuasyaraatAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListModelHadistMuasyaraat) {
                showSelectedListHadist(data)
            }
        })
    }

    private fun showSelectedListHadist(listmodelhadist: ListModelHadistMuasyaraat) {

        /* val detailDoa = Intent(this, DetailDoa::class.java )

       detailDoa.putExtra("intent_title",listmodel.title)
       detailDoa.putExtra("intent_arabic",listmodel.arabic)
       detailDoa.putExtra("intent_latin",listmodel.latin)
       detailDoa.putExtra("intent_translation",listmodel.translation)
       startActivity(detailDoa)


       Toast.makeText(this, "Kamu memilih " + listmodelhadist.arabicHadistMuasyaraat, Toast.LENGTH_LONG).show() */

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}