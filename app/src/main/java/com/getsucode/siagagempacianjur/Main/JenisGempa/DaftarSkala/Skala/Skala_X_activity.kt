package com.getsucode.siagagempacianjur.Main.JenisGempa.DaftarSkala.Skala

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.getsucode.siagagempacianjur.R

class Skala_X_activity : AppCompatActivity() {

    private val title = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_skala_x)

        setActionBarTitle(title)

        // action backpress
        supportActionBar?.setDisplayHomeAsUpEnabled(true);

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