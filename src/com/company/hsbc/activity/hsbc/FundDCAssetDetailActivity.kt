package com.svw.sc.audi.wallbox.ui.hsbc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R
//import com.svw.sc.audi.wallbox.databinding.AccountAssetDetailsFundBinding
import com.svw.sc.audi.wallbox.ui.bean.ErosionPropertyBean
import com.svw.sc.audi.wallbox.ui.hsbcAdapter.ErosionPropertyAdapter
import java.math.BigDecimal

class FundDCAssetDetailActivity: BaseActivity() {

    private lateinit var llAccumulateIncome: LinearLayout
    private lateinit var llFixedInvestment: LinearLayout
    private lateinit var llYesterdayEarn:LinearLayout
    private lateinit var llInvestedNumber: LinearLayout
    private lateinit var assetView: View
    private lateinit var clFundDt: ConstraintLayout
    private lateinit var editText: TextView
    private lateinit var checkAmountButton: Button
    private lateinit var transferInAndOutButton: Button
    private lateinit var assetFlow: RecyclerView
//    private lateinit var binding: AccountAssetDetailsFundBinding

    private var erosionPropertyBeanList = mutableListOf<ErosionPropertyBean>()


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
        transferInAndOutButton = findViewById(R.id.btn_exchange)
        assetFlow = findViewById(R.id.rv_asset_flow)
        initViewStatus()
        val erosionPropertyBean = ErosionPropertyBean(true,"转入", BigDecimal(50000),"2022/12/18","2022/12/18","2020/12/18")
        erosionPropertyBeanList.add(erosionPropertyBean)
        assetFlow.adapter = ErosionPropertyAdapter(this,erosionPropertyBeanList as ArrayList)
        editText.setOnClickListener { startActivity(Intent(this,FundAssetEditActivity::class.java)) }
        checkAmountButton.setOnClickListener { toConfirmUpdate() }
        transferInAndOutButton.setOnClickListener { startActivity(Intent(this,AssetTransferActivity::class.java).putExtra("transferType",2)) }
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){
        llFixedInvestment.visibility = View.GONE
        llInvestedNumber.visibility = View.GONE
        assetView.visibility = View.INVISIBLE
        clFundDt.visibility = View.GONE
    }

    private fun toConfirmUpdate(){
        startActivity(Intent(this,ConfirmUpdateActivity::class.java))
    }

}