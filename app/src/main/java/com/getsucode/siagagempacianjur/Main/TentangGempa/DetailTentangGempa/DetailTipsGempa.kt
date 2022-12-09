package com.getsucode.siagagempacianjur.Main.TentangGempa.DetailTentangGempa

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.getsucode.siagagempacianjur.R
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class DetailTipsGempa : AppCompatActivity() {

    private val title = " "
    lateinit var tv_detail_Judul: TextView
    lateinit var tv_detail_Penjelasan: TextView

    //ads
    lateinit var bannerAdViewDetail: AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_detail_tips_gempa)

        setActionBarTitle(title)
        setDetailItemDoa()

        // ads banner
        setAdsDetail()

        // action backpress
        supportActionBar?.setDisplayHomeAsUpEnabled(true);

    }

    private fun setDetailItemDoa() {

        tv_detail_Judul = findViewById(R.id.tv_detail_Judul)
        tv_detail_Penjelasan = findViewById(R.id.tv_detail_Penjelasan)

        val judul = intent.getStringExtra("intent_judul")
        val arabic = intent.getStringExtra("intent_penjelasan")

        tv_detail_Judul.text = judul
        tv_detail_Penjelasan.text = arabic

    }

    private fun setAdsDetail() {

        MobileAds.initialize(this)
        bannerAdViewDetail = findViewById(R.id.banner_ad_detail)

        val adRequest = AdRequest.Builder().build()
        bannerAdViewDetail.loadAd(adRequest)
        bannerAdViewDetail.setAdListener(object : AdListener() {
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

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // todo: goto back activity from here
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}