package com.getsucode.siagagempacianjur.Main.TentangGempa

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.siagagempacianjur.R
import com.getsucode.siagagempacianjur.Adapter.ListTipsGempaAdapter
import com.getsucode.siagagempacianjur.Main.TentangGempa.DetailTentangGempa.DetailTipsGempa
import com.getsucode.siagagempacianjur.Model.ListModel
import com.getsucode.siagagempacianjur.Repository.ItemTipsGempa

class TentangGempa : AppCompatActivity() {

    private var title = " "
    private lateinit var rvListDoa: RecyclerView
    private val list = ArrayList<ListModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_tentang_gempa)

        setActionBarTitle(title)

        rvListDoa = findViewById(R.id.rv_doa)
        rvListDoa.setHasFixedSize(true)

        list.addAll(ItemTipsGempa.listDataTips)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvListDoa.layoutManager = LinearLayoutManager(this)
        val listdoa = ListTipsGempaAdapter(list)
        rvListDoa.adapter = listdoa

        listdoa.setOnItemClickCallback(object : ListTipsGempaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ListModel) {
                showSelectedListDoa(data)
            }
        })
    }

    private fun showSelectedListDoa(listmodel: ListModel) {

        val detailDoaTips = Intent(this, DetailTipsGempa::class.java)

        detailDoaTips.putExtra("intent_judul", listmodel.judulTips)
        detailDoaTips.putExtra("intent_penjelasan", listmodel.penjelasanTips)
        startActivity(detailDoaTips)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}