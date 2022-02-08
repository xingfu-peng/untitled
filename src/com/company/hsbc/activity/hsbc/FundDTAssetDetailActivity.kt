package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class FundDTAssetDetailActivity: BaseActivity() {

    private lateinit var llAccumulateIncome: LinearLayout
    private lateinit var llFixedInvestment: LinearLayout
    private lateinit var llYesterdayEarn:LinearLayout
    private lateinit var llInvestedNumber: LinearLayout
    private lateinit var assetView: View
    private lateinit var clFundDt: ConstraintLayout
    private lateinit var editText: TextView
    private lateinit var checkAmountButton: Button
    private lateinit var transferOutButton: Button


    override fun initContentView(): Int {
        return R.layout.account_asset_details_fund
    }

    override fun initView() {
        llAccumulateIncome = findViewById(R.id.ll_accumulate_income)
        llFixedInvestment = findViewById(R.id.ll_fixed_investment)
        llYesterdayEarn = findViewById(R.id.ll_yesterday_earn)
        llInvestedNumber = findViewById(R.id.ll_invested_number)
        assetView = findViewById(R.id.view_asset)
        clFundDt = findViewById(R.id.cl_fund_dt)
        editText = findViewById(R.id.tv_edit)
        checkAmountButton = findViewById(R.id.btn_confirm_update)
        transferOutButton = findViewById(R.id.btn_exchange)
        transferOutButton.text = "转出"
        initViewStatus()
        editText.setOnClickListener { startActivity(Intent(this,FundAssetEditActivity::class.java)) }
        checkAmountButton.setOnClickListener { toConfirmUpdate() }
        transferOutButton.setOnClickListener { startActivity(Intent(this,AssetTransferActivity::class.java).putExtra("transferType",1)) }
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){

    }

    private fun toConfirmUpdate(){
        startActivity(Intent(this,ConfirmUpdateActivity::class.java))
    }

}