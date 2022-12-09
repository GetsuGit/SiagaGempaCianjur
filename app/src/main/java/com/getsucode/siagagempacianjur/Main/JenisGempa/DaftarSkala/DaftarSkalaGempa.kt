package com.getsucode.siagagempacianjur.Main.JenisGempa.DaftarSkala

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.getsucode.siagagempacianjur.Main.JenisGempa.DaftarSkala.Skala.*
import com.getsucode.siagagempacianjur.R

class DaftarSkalaGempa : AppCompatActivity() {

    private val title = "Skala Gempa"
    lateinit var Skala_I: CardView
    lateinit var Skala_II: CardView
    lateinit var Skala_III: CardView
    lateinit var Skala_IV: CardView
    lateinit var Skala_IX: CardView
    lateinit var Skala_V: CardView
    lateinit var Skala_VI: CardView
    lateinit var Skala_VII: CardView
    lateinit var Skala_VIII: CardView
    lateinit var Skala_X: CardView
    lateinit var Skala_XI: CardView
    lateinit var Skala_XII: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_daftar_skala_gempa)

        setActionBarTitle(title)
        setDaftarSkalaGempa()

        // action backpress
        supportActionBar?.setDisplayHomeAsUpEnabled(true);

    }

    private fun setDaftarSkalaGempa(){

        Skala_I = findViewById(R.id.Skala_I)
        Skala_II = findViewById(R.id.Skala_II)
        Skala_III = findViewById(R.id.Skala_III)
        Skala_IV = findViewById(R.id.Skala_IV)
        Skala_V = findViewById(R.id.Skala_V)
        Skala_VI = findViewById(R.id.Skala_VI)
        Skala_VII = findViewById(R.id.Skala_VII)
        Skala_VIII = findViewById(R.id.Skala_VIII)
        Skala_IX = findViewById(R.id.Skala_IX)
        Skala_X = findViewById(R.id.Skala_X)
        Skala_XI = findViewById(R.id.Skala_XI)
        Skala_XII = findViewById(R.id.Skala_XII)

        Skala_I.setOnClickListener {
            Intent(this, Skala_I_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_II.setOnClickListener {
            Intent(this, Skala_II_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_III.setOnClickListener {
            Intent(this,  Skala_III_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_IV.setOnClickListener {
            Intent(this,   Skala_IV_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_IX.setOnClickListener {
            Intent(this, Skala_IX_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_V.setOnClickListener {
            Intent(this, Skala_V_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_VI.setOnClickListener {
            Intent(this, Skala_VI_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_VII.setOnClickListener {
            Intent(this, Skala_VII_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_VIII.setOnClickListener {
            Intent(this, Skala_VIII_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_X.setOnClickListener {
            Intent(this,  Skala_X_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_XI.setOnClickListener {
            Intent(this,  Skala_XI_activity::class.java).also{
                startActivity(it)
            }
        }

        Skala_XII.setOnClickListener {
            Intent(this,   Skala_XII_activity::class.java).also{
                startActivity(it)
            }
        }

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