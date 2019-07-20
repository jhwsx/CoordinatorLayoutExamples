package com.wzc.coordinatorlayout.examples

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.TextView

/**
 *
 * @author wzc
 * @date 2019/7/17
 */
class DependentView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyleAttr: Int = 0
) :
    TextView(context, attrs, defaultStyleAttr) {
    init {
        isClickable = true
    }

    private var lastX: Float = 0F
    private var lastY: Float = 0F
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event == null) {
            return super.onTouchEvent(event)
        }
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                lastX = event.x
                lastY = event.y
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                val offsetX = event.x - lastX
                val offsetY = event.y - lastY
                translationX += offsetX
                translationY += offsetY
                lastX = event.x
                lastY = event.y
                return true
            }
            MotionEvent.ACTION_UP -> {
                lastX = event.x
                lastY = event.y
                return true
            }
            else -> {
                return super.onTouchEvent(event)
            }
        }
    }
}