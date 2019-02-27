package com.zeyadassem.slate.ui.utils

import android.content.Context
import android.content.Intent
import com.zeyadassem.slate.ui.activities.ChooseLocationActivity
import com.zeyadassem.slate.ui.activities.SettingsActivity

object UiNavigator {
    fun openSettingsActivity(context: Context){
        val intent = Intent(context, SettingsActivity::class.java)
        context.startActivity(intent)
    }

    fun openChooseLocationActivity(context: Context){
        val intent = Intent(context, ChooseLocationActivity::class.java)
        context.startActivity(intent)
    }
}