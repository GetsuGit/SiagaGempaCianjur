package com.getsucode.siagagempacianjur.ToolbarMenu

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.ActionBar
import com.getsucode.siagagempacianjur.R

class TermofServiceDetail : AppCompatActivity() {

    private val title = "Terms of Service"
    lateinit var webview: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_termof_service_detail)

        setActionBarTitle(title)
        webview = findViewById(R.id.webview)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("file:///android_asset/TermofService.html")
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}