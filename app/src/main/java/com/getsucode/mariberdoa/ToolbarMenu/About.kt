package com.getsucode.mariberdoa.ToolbarMenu

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import com.getsucode.mariberdoa.R

class About : AppCompatActivity() {

    private var title = "About"
    lateinit var privacy_policy: LinearLayout
    lateinit var terms_ofservice: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Mode Portrait
        setContentView(R.layout.activity_about)

        setNavigation()
        setActionBarTitle(title)

    }

    private fun setNavigation(){

        privacy_policy = findViewById(R.id.privacy_policy)
        terms_ofservice = findViewById(R.id.terms_ofservice)
        

        privacy_policy.setOnClickListener {
            Intent(this, PrivacyPolicyDetail::class.java).also{
                startActivity(it)
            }
        }

        terms_ofservice.setOnClickListener {
            Intent(this, TermofServiceDetail::class.java).also{
                startActivity(it)
            }
        }

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

}