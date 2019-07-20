package com.wzc.coordinatorlayout.examples

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout

/**
 *
 * @author wzc
 * @date 2019/7/16
 */
class TopBehavior (context: Context, attrs: AttributeSet) :
    CoordinatorLayout.Behavior<ConstraintLayout>(context, attrs){
    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: ConstraintLayout,
        dependency: View
    ): Boolean {
        return dependency.id == R.id.nested_scrollview
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: ConstraintLayout,
        dependency: View
    ): Boolean {
        child.offsetTopAndBottom(dependency.top - child.bottom)
        return dependency.top > 0
    }

}