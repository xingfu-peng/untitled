package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class BondAssetDetailActivity: BaseActivity() {

   private lateinit var colorBackground: ConstraintLayout
    private lateinit var checkAmountButton: Button
    private lateinit var transferInAndOutButton: Button

    override fun initContentView(): Int {
        return R.layout.account_asset_details_stock_bond
    }

    override fun initView() {
        colorBackground = findViewById(R.id.cl_background)
        checkAmountButton = findViewById(R.id.btn_confirm_update)
        transferInAndOutButton = findViewById(R.id.btn_exchange)
        checkAmountButton.setOnClickListener {  startActivity(Intent(this,ConfirmUpdateActivity::class.java)) }
        transferInAndOutButton.setOnClickListener { startActivity(Intent(this,AssetTransferActivity::class.java)) }
        initViewStatus()
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){
        colorBackground.background = ContextCompat.getDrawable(this,R.drawable.account_color_3794af_f6f7fa)
    }

}