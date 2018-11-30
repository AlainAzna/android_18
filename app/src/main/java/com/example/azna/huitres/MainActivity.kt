package com.example.azna.huitres

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_debut.*
import kotlinx.android.synthetic.main.fragment_fin.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val jours = Array<String>(365,{i:Int->(i+1).toString()})
    val heures= Array<String>(24,{i:Int->i.toString()})
    val minutes = Array<String>(60,{i:Int->i.toString()})


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        numberPicker0.minValue=0
        numberPicker0.maxValue=jours.size-1
        numberPicker0.displayedValues=jours
        numberPicker0.value=333
        numberPicker1.minValue=0
        numberPicker1.maxValue=heures.size -1
        numberPicker1.displayedValues = heures
        numberPicker1.value=8
        numberPicker2.minValue=0
        numberPicker2.maxValue=minutes.size -1
        numberPicker2.displayedValues = minutes
        numberPicker2.value=0
        numberPicker3.minValue=0
        numberPicker3.maxValue=heures.size -1
        numberPicker3.displayedValues = heures
        numberPicker3.value=8
        numberPicker4.minValue=0
        numberPicker4.maxValue=minutes.size -1
        numberPicker4.displayedValues = minutes
        numberPicker4.value=0


        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
