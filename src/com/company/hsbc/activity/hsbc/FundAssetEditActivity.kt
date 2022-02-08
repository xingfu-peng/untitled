package com.svw.sc.audi.wallbox.ui.hsbc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.svw.sc.audi.base.ui.BaseActivity
import com.svw.sc.audi.wallbox.R

class FundAssetEditActivity: BaseActivity() {
    private lateinit var dividendTextView: TextView
    private lateinit var bonusTextView: TextView
    private lateinit var dividendType: TextView

    override fun initContentView(): Int {
        return R.layout.account_edit_fund
    }

    override fun initView() {
        dividendTextView = findViewById(R.id.tv_dividend_type_one)
        bonusTextView = findViewById(R.id.tv_dividend_type_two)
        dividendType = findViewById(R.id.tv_dividend_type_text)
        dividendTextView.setOnClickListener {
            dividendType.text = "大部分平台默认选择此种“现金分红”方式,一般不需要变更。届时若此基金发生分红，你在“汇选账本”的基金资产将会对应减少、现金资产会对应增加,我们会自动为你更新。"
            dividendTextView.let { it.setTextColor(ContextCompat.getColor(this,R.color.text_color_16142D))
            it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_FFF2F2))
            }
            bonusTextView.let {
                it.setTextColor(ContextCompat.getColor(this,R.color.text_color_9D9BAF))
                it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_F6F7FA))
            }
        }
        bonusTextView.setOnClickListener {
            dividendType.text = "你选择了“红利再投”分红方式。届时若此基金发生分红，我们将为你自动更新再投份额增加的后续收益变化。"
            dividendTextView.let { it.setTextColor(ContextCompat.getColor(this,R.color.text_color_9D9BAF))
                it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_F6F7FA))
            }
            bonusTextView.let {
                it.setTextColor(ContextCompat.getColor(this,R.color.text_color_16142D))
                it.setBackgroundColor(ContextCompat.getColor(this,R.color.text_color_FFF2F2))
            }
        }
        initViewStatus()
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    private fun initViewStatus(){
    }

}