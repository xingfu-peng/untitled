package com.svw.sc.audi.wallbox.ui.hsbc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class AssetTransferActivity: BaseActivity() {

    private lateinit var transferInButton: TextView
    private lateinit var transferOutButton: TextView
    private lateinit var buyingTimeOne: TextView
    private lateinit var buyingTimeTwo: TextView
    private lateinit var allTransfer: TextView
    private lateinit var confirmButton: Button
    var transferType = 0

    override fun initContentView(): Int {
        return R.layout.account_transfer_in_and_out
    }

    override fun initView() {
        transferInButton = findViewById(R.id.tv_transfer_in)
        transferOutButton = findViewById(R.id.tv_transfer_out)
        buyingTimeOne = findViewById(R.id.tv_time_one)
        buyingTimeTwo = findViewById(R.id.tv_time_two)
        allTransfer = findViewById(R.id.tv_all)
        confirmButton = findViewById(R.id.btn_confirm)
        transferType = intent.getIntExtra("transferType",0)
        buyingTimeOne.setOnClickListener { it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_FFF2F2))
            buyingTimeTwo.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_F6F7FA))
        }
        buyingTimeTwo.setOnClickListener { it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_FFF2F2))
            buyingTimeOne.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_F6F7FA))
        }
        transferInButton.setOnClickListener {
            it.setBackgroundResource(R.drawable.account_rect_414056_rc8)
            transferInButton.setTextColor(ContextCompat.getColor(this,R.color.white))
            transferOutButton.setBackgroundResource(R.drawable.account_rect_white_rc8)
            transferOutButton.setTextColor(ContextCompat.getColor(this,R.color.text_color_414056))
            allTransfer.visibility = View.GONE
        }
        transferOutButton.setOnClickListener {
            it.setBackgroundResource(R.drawable.account_rectright_414056_rc8)
            transferOutButton.setTextColor(ContextCompat.getColor(this,R.color.white))
            transferInButton.setBackgroundResource(R.drawable.account_rectleft_white_rc8)
            transferInButton.setTextColor(ContextCompat.getColor(this,R.color.text_color_414056))
            allTransfer.visibility = View.VISIBLE
        }
        confirmButton.setOnClickListener { finish() }
        initViewStatus()
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){
        if (transferType == 2){
            transferInButton.let {
                it.setTextColor(ContextCompat.getColor(this,R.color.text_color_414056))
                it.setBackgroundResource(R.drawable.account_rectleft_white_rc8)
            }
            transferOutButton.let {
                it.setTextColor(ContextCompat.getColor(this,R.color.white))
                it.setBackgroundResource(R.drawable.account_rectright_414056_rc8)
            }
        }
    }

}