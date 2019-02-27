package com.zeyadassem.slate.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.zeyadassem.slate.R
import com.zeyadassem.slate.ui.utils.UiNavigator
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.toolbar.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setUi()
    }

    private fun setUi() {
        setSupportActionBar(toolBar)
        mapIv.setOnClickListener{
            UiNavigator.openChooseLocationActivity(this)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.settings_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.save_item_action -> {
            //todo add the saving behavior here.
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
