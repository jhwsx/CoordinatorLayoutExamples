package com.wzc.coordinatorlayout.examples

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_bottom_sheet_behavior.*

class BottomSheetBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_behavior)
        setSupportActionBar(toolbar)
        cl_content.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                Log.d("wzc", "coordinator_layout.height = ${coordinator_layout.height}, ll_content.height = ${cl_content.height}")
                val behavior = (nested_scrollview.layoutParams as CoordinatorLayout.LayoutParams).behavior
                val bottomSheetBehavior = behavior as BottomSheetBehavior
                bottomSheetBehavior.peekHeight = coordinator_layout.height - cl_content.height

                bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                    override fun onSlide(bottomSheet: View, slideOffset: Float) {
                        cl_content.scaleY = 1.0f - slideOffset;
                        cl_content.scaleX = 1.0f - slideOffset;
                        iv_background.translationY = -(iv_background.height-toolbar.height) * slideOffset;
                    }

                    override fun onStateChanged(bottomSheet: View, newState: Int) =
                        if (newState === BottomSheetBehavior.STATE_EXPANDED) {
                            toolbar.setBackgroundColor(ContextCompat.getColor(this@BottomSheetBehaviorActivity, R.color.colorPrimary))
                        } else {
                            toolbar.setBackgroundColor(ContextCompat.getColor(this@BottomSheetBehaviorActivity, android.R.color.transparent))
                        }
                })
                cl_content.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })

    }
}
