package com.wzc.coordinatorlayout.examples

import android.content.res.Resources
import android.util.TypedValue

/**
 *
 * @author wzc
 * @date 2019/7/17
 */
fun Int.dp2px(): Float =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), Resources.getSystem().displayMetrics)