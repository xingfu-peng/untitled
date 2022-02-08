package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class AccountActivity: BaseActivity() {

    private lateinit var fundDcButton: Button
    private lateinit var fundDButton: Button
    private lateinit var stockButton: Button
    private lateinit var bondButton: Button
    private lateinit var currentBankButton: Button
    private lateinit var regularBankButton: Button
    private lateinit var conductBankButton: Button
    private lateinit var houseButton: Button
    private lateinit var carButton: Button

    override fun initContentView(): Int {
        return R.layout.account_activity
    }

    override fun initView() {
        fundDcButton = findViewById(R.id.tv_fund_dc)
        fundDButton = findViewById(R.id.tv_fund_d)
        stockButton = findViewById(R.id.tv_stock)
        bondButton = findViewById(R.id.tv_bond)
        houseButton = findViewById(R.id.tv_fang)
        carButton = findViewById(R.id.tv_car)
        currentBankButton = findViewById(R.id.tv_bank_current)
        regularBankButton = findViewById(R.id.tv_bank_regular)
        conductBankButton = findViewById(R.id.tv_bank_conduct_financial)
        fundDcButton.setOnClickListener { startActivity(Intent(this, FundDCAssetDetailActivity::class.java)) }
        fundDButton.setOnClickListener { startActivity(Intent(this, FundDTAssetDetailActivity::class.java)) }
        stockButton.setOnClickListener { startActivity(Intent(this, StockAssetDetailActivity::class.java)) }
        bondButton.setOnClickListener { startActivity(Intent(this, BondAssetDetailActivity::class.java)) }
        currentBankButton.setOnClickListener {
            startActivity(Intent(this, BankAssetDetailActivity::class.java).putExtra("bankType", 1))}
            regularBankButton.setOnClickListener { startActivity(Intent(this, BankAssetDetailActivity::class.java).putExtra("bankType", 2)) }
            conductBankButton.setOnClickListener { startActivity(Intent(this, BankAssetDetailActivity::class.java).putExtra("bankType", 3)) }
        houseButton.setOnClickListener { startActivity(Intent(this,HouseAssetDetailActivity::class.java)) }
        carButton.setOnClickListener { startActivity(Intent(this,CarAssetDetailActivity::class.java)) }

    }
    override fun initData(savedInstanceState: Bundle?) {
    }
}