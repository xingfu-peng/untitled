package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class CarAssetDetailActivity: BaseActivity() {

    private lateinit var editHouseAsset: TextView

    override fun initContentView(): Int {
        return R.layout.account_asset_detail_car
    }

    override fun initView() {
        editHouseAsset = findViewById(R.id.tv_edit)
        editHouseAsset.setOnClickListener { startActivity(Intent(this,CarAssetEditActivity::class.java)) }
        initViewStatus()
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus() {
    }
}