package com.wzc.coordinatorlayout.examples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import kotlinx.android.synthetic.main.activity_depenent_behavior.*

class DependentBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depenent_behavior)
        val layoutParams = iv.layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = DependentBehavior()
    }
}
