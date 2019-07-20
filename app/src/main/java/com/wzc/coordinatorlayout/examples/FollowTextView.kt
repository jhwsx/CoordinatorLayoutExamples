package com.wzc.coordinatorlayout.examples

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout

/**
 *
 * @author wzc
 * @date 2019/7/19
 */
class  FollowTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defaultStyleInt: Int = 0) :
    TextView(context, attrs, defaultStyleInt), CoordinatorLayout.AttachedBehavior {
    override fun getBehavior(): CoordinatorLayout.Behavior<*> {
        return DependentBehavior()
    }

}