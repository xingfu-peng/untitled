package com.svw.sc.audi.wallbox.ui.hsbc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class ConfirmUpdateActivity: BaseActivity() {

    private lateinit var confirmButton: Button

    override fun initContentView(): Int {
        return R.layout.account_confirm_update
    }

    override fun initView() {
        confirmButton = findViewById(R.id.btn_confirm)
        initViewStatus()
        confirmButton.setOnClickListener { finish() }
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){
    }

}