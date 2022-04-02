package com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import androidx.appcompat.app.ActionBar
import com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.SubDaftarHadist.*
import com.getsucode.mariberdoa.R

class DaftarHadist : AppCompatActivity() {

    private val title = "Hadist"
    lateinit var cd_HadistImaniat: CardView
    lateinit var cd_HadistIbaadaat: CardView
    lateinit var cd_HadistMualamaat: CardView
    lateinit var cd_HadistMuasyaraat: CardView
    lateinit var cd_HadistAkhlaqiyaat: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_daftar_hadist)

        setActionBarTitle(title)
        setListHadist()

    }

    private fun setListHadist(){

        cd_HadistImaniat = findViewById(R.id.cd_HadistImaniat)
        cd_HadistIbaadaat = findViewById(R.id.cd_HadistIbaadaat)
        cd_HadistMualamaat = findViewById(R.id.cd_HadistMualamaat)
        cd_HadistMuasyaraat = findViewById(R.id.cd_HadistMuasyarakat)
        cd_HadistAkhlaqiyaat = findViewById(R.id.cd_HadistAkhlaqiyaat)

        cd_HadistImaniat.setOnClickListener {
            Intent(this, ListHadistImaniat::class.java).also{
                startActivity(it)
            }
        }

        cd_HadistIbaadaat.setOnClickListener {
            Intent(this, ListHadistIbaadaat::class.java).also{
                startActivity(it)
            }
        }

        cd_HadistMualamaat.setOnClickListener {
            Intent(this, ListHadistMuamalaat::class.java).also{
                startActivity(it)
            }
        }

        cd_HadistMuasyaraat.setOnClickListener {
            Intent(this, ListHadistMuasyaraat::class.java).also{
                startActivity(it)
            }
        }

        cd_HadistAkhlaqiyaat.setOnClickListener {
            Intent(this, ListHadistAkhlaqiyaat::class.java).also{
                startActivity(it)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}