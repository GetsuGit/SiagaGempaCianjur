package com.getsucode.siagagempacianjur.Main.InfoBMKG

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.getsucode.siagagempacianjur.R

class WebBMKG : AppCompatActivity() {

    private val title = "Info BMKG"
    lateinit var webView : WebView
    lateinit var webSettings : WebSettings
    lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_web_bmkg)

        setActionBarTitle(title)

        webView = findViewById<WebView>(R.id.webviewID)
        webSettings = webView.settings
        webView.webViewClient = WebViewClient()

        //aktifasi javascript
        webSettings.javaScriptEnabled = true

        // load pada website
        webView.loadUrl("https://www.bmkg.go.id/")

        // inisialisasi kebutuhan browser
        webView.settings.javaScriptEnabled = true
        webView.settings.displayZoomControls = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.scrollBarStyle = WebView.SCROLLBARS_OUTSIDE_OVERLAY
        webView.settings.allowFileAccessFromFileURLs = true
        webView.settings.allowUniversalAccessFromFileURLs = true

        progressBar = findViewById<ProgressBar>(R.id.progressBarID) as ProgressBar
        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView, newProgress: Int) {
                progressBar.visibility = View.VISIBLE
                progressBar.progress = newProgress
                if (newProgress == 100) {
                    progressBar.visibility = View.GONE
                }
            }
        }

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}