package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class HouseAssetDetailActivity: BaseActivity(), View.OnClickListener {

    private lateinit var editHouseAsset: TextView

    override fun initContentView(): Int {
        return R.layout.account_asset_detail_fang
    }

    override fun initView() {
        editHouseAsset = findViewById(R.id.tv_edit)
        editHouseAsset.setOnClickListener(this)
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.tv_edit -> {startActivity(Intent(this,HouseAssetEditActivity::class.java))}
       }
    }


}