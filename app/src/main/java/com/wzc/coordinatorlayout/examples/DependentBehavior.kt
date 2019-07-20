package com.wzc.coordinatorlayout.examples

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout

/**
 * https://blog.csdn.net/qibin0506/article/details/50290421
 * @author wzc
 * @date 2019/7/14
 */
private const val TAG = "DependentBehavior"

class DependentBehavior :
    CoordinatorLayout.Behavior<View> {

    constructor()
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)


    // 确定依赖谁
    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return dependency is DependentView
    }

    // 当依赖的View发生改变时回调
    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        if (child is FollowTextView) {
            child.x = dependency.x + 120.dp2px()
            child.y = dependency.y
        } else if (child is TextView) {
            child.x = dependency.x
            child.y = dependency.y + 120.dp2px()
        } else if (child is ImageView) {
            child.x = dependency.x
            child.y = dependency.y - 50.dp2px()
        }
        return true
    }
}