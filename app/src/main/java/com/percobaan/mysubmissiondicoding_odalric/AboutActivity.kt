package com.percobaan.mysubmissiondicoding_odalric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AboutActivity : AppCompatActivity() {
    private lateinit var actionBar: ActionBar
    private lateinit var iv_developer : ImageView
    private var title: String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)
        actionBar = supportActionBar!!
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        iv_developer = findViewById(R.id.iv_developer)
        Glide.with(this)
             .load(R.drawable.odalric)
             .circleCrop()
             .into(iv_developer)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}

