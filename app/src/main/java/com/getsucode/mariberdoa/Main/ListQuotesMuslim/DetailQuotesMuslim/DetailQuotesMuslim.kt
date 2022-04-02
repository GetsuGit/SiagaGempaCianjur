package com.getsucode.mariberdoa.Main.ListQuotesMuslim.DetailQuotesMuslim

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.mariberdoa.R

class DetailQuotesMuslim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_detail_quotes_muslim)
    }
}