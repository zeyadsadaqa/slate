package com.zeyadassem.slate.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.zeyadassem.slate.R
import com.zeyadassem.slate.ui.utils.UiNavigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUi()
    }

    private fun setUi() {
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.settings_item_action -> {
            UiNavigator.openSettingsActivity(this)
            true
        }


        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
