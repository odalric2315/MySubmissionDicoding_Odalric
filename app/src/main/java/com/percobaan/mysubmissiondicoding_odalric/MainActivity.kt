package com.percobaan.mysubmissiondicoding_odalric

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rv_aseanCountry : RecyclerView
    private var list: ArrayList<Country> = arrayListOf()
    private lateinit var adapter : ListCountryAdapter
    private var title: String = "ASEAN Country"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ListCountryAdapter(list)

        rv_aseanCountry = findViewById(R.id.rv_aseanCountry)
        rv_aseanCountry.setHasFixedSize(true)

        list.addAll(CountryData.listData)
        rv_aseanCountry.isClickable = true

        showRecyclerList()
        setActionBarTitle(title)
    }

    private fun showRecyclerList(){
        rv_aseanCountry.layoutManager = LinearLayoutManager(this)
        val listCountryAdapter = ListCountryAdapter(list)
        rv_aseanCountry.adapter = listCountryAdapter

        listCountryAdapter.setOnItemClickCallback(object : ListCountryAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Country) {
                showDetailList(data)
                showSelectedCountry(data)
            }
        })
    }

    private fun showDetailList(data: Country){
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_NAME, data.name)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
            intent.putExtra(DetailActivity.EXTRA_PHOTO, data.photo)
            startActivity(intent)
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.rv_aseanCountry -> {
                title = "ASEAN Country"
                showDetailList(data = Country())
            }
        }
        setActionBarTitle(title)
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun showSelectedCountry(country: Country) {
        Toast.makeText(this, "You Choose " + country.name, Toast.LENGTH_SHORT).show()
    }
}

