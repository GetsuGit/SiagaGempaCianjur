package com.getsucode.mariberdoa.Main.ListQuotesMuslim

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.mariberdoa.Adapter.ListQuotesMuslimAdapter
import com.getsucode.mariberdoa.Main.ListQuotesMuslim.DetailQuotesMuslim.DetailQuotesMuslim
import com.getsucode.mariberdoa.Model.ListQuotesMuslimModel
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.Repository.ItemHadistMuasyaraat
import com.getsucode.mariberdoa.Repository.ItemQuotesMuslim

class DaftarQuotesMuslim : AppCompatActivity() {

    private val title = "Quotes"
    private lateinit var rvListQuotesMuslim: RecyclerView
    private val list = ArrayList<ListQuotesMuslimModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_daftar_quotes_muslim)

        setActionBarTitle(title)
        rvListQuotesMuslim= findViewById(R.id.rv_quotesmuslime)
        rvListQuotesMuslim.setHasFixedSize(true)

        list.addAll(ItemQuotesMuslim.listDataQuotesMuslim)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListQuotesMuslim.layoutManager = LinearLayoutManager(this)
        val listQuotesMuslim = ListQuotesMuslimAdapter(list)
        rvListQuotesMuslim.adapter = listQuotesMuslim

        listQuotesMuslim.setOnItemClickCallback(object: ListQuotesMuslimAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ListQuotesMuslimModel) {

            }
        })
    }

    private fun showSelectedListQuotesMuslim(listmodelQuotesMuslim: ListQuotesMuslimModel) {

         val detailQuotesMuslim = Intent(this, DetailQuotesMuslim::class.java )
         detailQuotesMuslim .putExtra("intent_imageQuotesMuslim", listmodelQuotesMuslim.imageQuotesMuslim)
         startActivity( detailQuotesMuslim)

       // Toast.makeText(this, "Kamu memilih " + listmodelQuotesMuslim.imageQuotesMuslim, Toast.LENGTH_LONG).show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}