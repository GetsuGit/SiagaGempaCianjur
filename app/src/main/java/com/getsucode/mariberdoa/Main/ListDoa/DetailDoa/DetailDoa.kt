package com.getsucode.mariberdoa.Main.ListDoa.DetailDoa

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.getsucode.mariberdoa.R
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import org.w3c.dom.Text

class DetailDoa : AppCompatActivity() {

    private val title = "Doa"
    lateinit var tv_detail_JudulDoa: TextView
    lateinit var tv_detail_Arabic: TextView
    lateinit var tv_detali_Latin: TextView
    lateinit var tv_detail_Arti: TextView

    //ads
    lateinit var bannerAdViewDetail: AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_detail_doa)

        setActionBarTitle(title)
        setDetailItemDoa()

        // ads banner
        setAdsDetail()

    }

    private fun setDetailItemDoa() {

        tv_detail_JudulDoa = findViewById(R.id.tv_detail_JuduDoa)
        tv_detail_Arabic = findViewById(R.id.tv_detail_Arabic)
        tv_detali_Latin = findViewById(R.id.tv_detail_Latin)
        tv_detail_Arti = findViewById(R.id.tv_detail_Arti)

        val judul = intent.getStringExtra("intent_title")
        val arabic = intent.getStringExtra("intent_arabic")
        val latin = intent.getStringExtra("intent_latin")
        val arti = intent.getStringExtra("intent_translation")

        tv_detail_JudulDoa.text = judul
        tv_detail_Arabic.text = arabic
        tv_detali_Latin.text = latin
        tv_detail_Arti.text = arti

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
}