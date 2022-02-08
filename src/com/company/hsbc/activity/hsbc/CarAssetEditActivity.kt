package com.svw.sc.audi.wallbox.ui.hsbc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class CarAssetEditActivity: BaseActivity() {

    private lateinit var confirmButton: Button

    override fun initContentView(): Int {
        return R.layout.account_edit_detail_car
    }

    override fun initView() {
        confirmButton = findViewById(R.id.btn_confirm)
        confirmButton.setOnClickListener { finish() }
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

}