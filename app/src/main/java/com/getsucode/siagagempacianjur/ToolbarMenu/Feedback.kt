package com.getsucode.siagagempacianjur.ToolbarMenu

import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import androidx.appcompat.app.ActionBar
import com.getsucode.siagagempacianjur.R

class Feedback : AppCompatActivity() {

    private val title = "Feedback"
    lateinit var cdFeedback: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_feedback)

        setActionBarTitle(title)
        setFeedback()
    }

    private fun setFeedback() {

        cdFeedback = findViewById(R.id.cdFeedback)

        cdFeedback.setOnClickListener {

            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://api.whatsapp.com/send?phone=6285216324924")
            )
            startActivity(intent)
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}