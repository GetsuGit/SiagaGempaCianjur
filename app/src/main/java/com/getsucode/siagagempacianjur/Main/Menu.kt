package com.getsucode.siagagempacianjur.Main

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.getsucode.siagagempacianjur.Main.InfoBMKG.WebBMKG
import com.getsucode.siagagempacianjur.R
import com.getsucode.siagagempacianjur.Main.TentangGempa.TentangGempa
import com.getsucode.siagagempacianjur.Main.JenisGempa.DaftarSkala.DaftarSkalaGempa
import com.getsucode.siagagempacianjur.ToolbarMenu.About
import com.getsucode.siagagempacianjur.ToolbarMenu.Feedback
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Menu : AppCompatActivity() {

    private val title = " "
    lateinit var menuDoa: CardView
    lateinit var jenisGempaID: CardView
    lateinit var bannerAdView: AdView
    lateinit var InfoBMKG: CardView
    lateinit var TentangAplikasi: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)
        setNavigationMenu()
        setAds()

    }

    private fun setAds() {

        MobileAds.initialize(this)
        bannerAdView = findViewById(R.id.banner_ad)

        val adRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(adRequest)
        bannerAdView.setAdListener(object : AdListener() {
            override fun onAdClosed() {
                super.onAdClosed()
                //do something on ad is closed
            }

            override fun onAdFailedToLoad(i: Int) {
                super.onAdFailedToLoad(i)
                //do something if ad failed to load
            }

            override fun onAdLeftApplication() {
                super.onAdLeftApplication()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }

            override fun onAdLoaded() {
                super.onAdLoaded()
            }

            override fun onAdClicked() {
                super.onAdClicked()
            }

            override fun onAdImpression() {
                super.onAdImpression()
            }
        })
    }

    private fun setNavigationMenu() {

        menuDoa = findViewById(R.id.menuDoa)
        jenisGempaID = findViewById(R.id.jenisGempaID)
        InfoBMKG = findViewById(R.id.InfoBMKG)
        TentangAplikasi = findViewById(R.id.TentangAplikasi)

        menuDoa.setOnClickListener {
            Intent(this, TentangGempa::class.java).also {
                startActivity(it)
            }
        }

        jenisGempaID.setOnClickListener {
            Intent(this, DaftarSkalaGempa::class.java).also {
                startActivity(it)
            }
        }

        InfoBMKG.setOnClickListener {
            Intent(this, WebBMKG::class.java).also {
                startActivity(it)
            }
        }

        TentangAplikasi.setOnClickListener {
            Toast.makeText(this, "Siaga Gempa Cianjur by GETSU CODE ", Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Intent.FLAG_ACTIVITY_CLEAR_TASK
        Intent.FLAG_ACTIVITY_NEW_TASK
        when (item.itemId) {
            R.id.miAbout -> {
                Intent(this, About::class.java).also {
                    startActivity(it)
                }
            }
            R.id.miFeedback -> {
                Intent(this, Feedback::class.java).also {
                    startActivity(it)
                }
            }
            R.id.miClose -> {
                Intent.FLAG_ACTIVITY_CLEAR_TASK
                Intent.FLAG_ACTIVITY_NEW_TASK
                onBackPressed()
            }
        }
        return true
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setIcon(R.drawable.gempalogo)

        Intent(this, EkitApp::class.java).also {
            startActivity(it)
            finishActivity(1)
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}

