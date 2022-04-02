package com.getsucode.mariberdoa.Main

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.getsucode.mariberdoa.Main.ListDoa.ListDoa
import com.getsucode.mariberdoa.Main.ListHadist.DaftarHadist.DaftarHadist
import com.getsucode.mariberdoa.Main.ListQuotesMuslim.DaftarQuotesMuslim
import com.getsucode.mariberdoa.R
import com.getsucode.mariberdoa.ToolbarMenu.About
import com.getsucode.mariberdoa.ToolbarMenu.Feedback
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Menu : AppCompatActivity() {

    lateinit var menuDoa: CardView
    lateinit var hadist: CardView
    lateinit var bannerAdView: AdView
    lateinit var QuotesMuslim: CardView
    lateinit var KutipanAyat: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_main)

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
        hadist = findViewById(R.id.hadist)
        QuotesMuslim = findViewById(R.id.QuotesMuslim)
        KutipanAyat = findViewById(R.id.KutipanAyat)


        menuDoa.setOnClickListener {
            Intent(this, ListDoa::class.java).also {
                startActivity(it)
            }
        }

        hadist.setOnClickListener {
            Intent(this, DaftarHadist::class.java).also {
                startActivity(it)
            }
        }

        QuotesMuslim.setOnClickListener {
            Intent(this, DaftarQuotesMuslim::class.java).also {
                startActivity(it)
            }
        }

        KutipanAyat.setOnClickListener {
            Toast.makeText(this, "Kutipan Ayat Mengenai Doa ", Toast.LENGTH_LONG).show()
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
        builder.setIcon(R.drawable.iconabout)

        Intent(this, EkitApp::class.java).also {
            startActivity(it)
        }
    }
}

