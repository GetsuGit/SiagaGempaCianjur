package com.getsucode.mariberdoa.Main

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.getsucode.mariberdoa.R

class EkitApp : AppCompatActivity() {

    private val title = "Exit"
    lateinit var back: ImageView
    lateinit var quite: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_quit_app)

        setActionBarTitle(title)
        setNavigationQuite()

    }

    private fun setNavigationQuite() {

        back = findViewById(R.id.back)
        quite = findViewById(R.id.quite)

        back.setOnClickListener {
            Intent(this, Menu::class.java).also {
                Intent.FLAG_ACTIVITY_CLEAR_TASK
                Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(it)
            }
        }

        quite.setOnClickListener {
            onBackPressed()
        }
    }

    // onback
    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setIcon(R.drawable.iconabout)

        builder.setTitle("Keluar")
        builder.setMessage("Anda mau keluar dari aplikasi ?")
        builder.setPositiveButton("Ya") { dialogInterface, i ->
            val homeIntent = Intent(Intent.ACTION_MAIN)
            homeIntent.addCategory(Intent.CATEGORY_HOME)
            homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(homeIntent)
            System.exit(1)
        }

        builder.setNegativeButton("Tidak", null)
        val alertDialog = builder.create()
        alertDialog.show()

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}