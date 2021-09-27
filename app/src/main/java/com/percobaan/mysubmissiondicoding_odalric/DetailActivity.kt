package com.percobaan.mysubmissiondicoding_odalric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    private lateinit var actionBar: ActionBar
    private var title: String = "Detail Country"

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)
        actionBar = supportActionBar!!
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val iv_detail2 : ImageView = findViewById(R.id.iv_detail2)
        val tv_detailname : TextView = findViewById(R.id.tv_detailname)
        val tv_detailcountry : TextView = findViewById(R.id.tv_detailcountry)

        val intent = intent
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO,0)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(100, 100))
            .into(iv_detail2)
        tv_detailname.text = name
        tv_detailcountry.text = detail

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