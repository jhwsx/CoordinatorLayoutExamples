package com.wzc.coordinatorlayout.examples

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_fab.setOnClickListener { startActivity(Intent(this,FABActivity::class.java)) }
        button_dependent_behavior.setOnClickListener { startActivity(Intent(this,DependentBehaviorActivity::class.java)) }
        button_scroll_behavior.setOnClickListener { startActivity(Intent(this,ScrollBehaviorActivity::class.java)) }
        button_appbarlayout.setOnClickListener { startActivity(Intent(this,AppBarLayoutActivity::class.java)) }
        button_collapsingtoolbarlayout.setOnClickListener { startActivity(Intent(this,CollapsingToolbarLayoutActivity::class.java)) }
        button_collapsingtoolbarlayout2.setOnClickListener { startActivity(Intent(this,CollapsingToolbarLayoutActivity2::class.java)) }
        button_collapsingtoolbarlayout3.setOnClickListener { startActivity(Intent(this,CollapsingToolbarLayoutActivity3::class.java)) }
        button_collapsingtoolbarlayout4.setOnClickListener { startActivity(Intent(this,CollapsingToolbarLayoutActivity4::class.java)) }
        button_bottomsheet_behavior.setOnClickListener { startActivity(Intent(this,BottomSheetBehaviorActivity::class.java)) }
    }
}
