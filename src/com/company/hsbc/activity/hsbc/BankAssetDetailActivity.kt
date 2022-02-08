package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class BankAssetDetailActivity: BaseActivity() {

    private lateinit var expireNotice: TextView
    private lateinit var termLimit: TextView
    private lateinit var termText: TextView
    private lateinit var expirationTimeText: TextView
    private lateinit var fixStartTime: TextView
    private lateinit var checkAmountButton: Button
    private lateinit var transferInAndOutButton: Button
    var type: Int = 0

    override fun initContentView(): Int {
        return R.layout.account_asset_details_bank
    }

    override fun initView() {
        type = intent.getIntExtra("bankType",0)
        expireNotice = findViewById(R.id.tv_expire_notice)
        termLimit = findViewById(R.id.tv_fix_amount_value)
        termText = findViewById(R.id.tv_fix_amount)
        expirationTimeText = findViewById(R.id.tv_fix_start)
        fixStartTime = findViewById(R.id.tv_fix_start_time)
        checkAmountButton = findViewById(R.id.btn_confirm_update)
        transferInAndOutButton = findViewById(R.id.btn_exchange)
        checkAmountButton.setOnClickListener {  startActivity(Intent(this,ConfirmUpdateActivity::class.java)) }
        transferInAndOutButton.setOnClickListener { startActivity(Intent(this,AssetTransferActivity::class.java)) }
        initViewStatus(type)
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(type: Int){

        when(type){
            1->{

            }
            2->{
                expireNotice.visibility = View.GONE
            }
            3->{
                expireNotice.visibility = View.GONE
                termLimit.visibility = View.GONE
                termText.visibility = View.GONE
                expirationTimeText.visibility = View.GONE
                fixStartTime.visibility = View.GONE
            }
        }

    }

}