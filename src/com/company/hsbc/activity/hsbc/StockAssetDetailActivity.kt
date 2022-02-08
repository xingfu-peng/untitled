package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class StockAssetDetailActivity: BaseActivity() {

    private lateinit var checkAmountButton: Button
    private lateinit var transferInAndOutButton: Button

    override fun initContentView(): Int {
        return R.layout.account_asset_details_stock_bond
    }

    override fun initView() {
        checkAmountButton = findViewById(R.id.btn_confirm_update)
        transferInAndOutButton = findViewById(R.id.btn_exchange)
        checkAmountButton.setOnClickListener {  startActivity(Intent(this,ConfirmUpdateActivity::class.java)) }
        transferInAndOutButton.setOnClickListener { startActivity(Intent(this,AssetTransferActivity::class.java)) }
        initViewStatus()
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){

    }

}