package com.wzc.coordinatorlayout.examples

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_app_bar_layout.*

/**
 * https://www.jianshu.com/p/7caa5f4f49bd Android 详细分析AppBarLayout的五种ScrollFlags
 */
class AppBarLayoutActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "AppBarLayoutActivity"
    }
    data class PageData(val title: String, val fragment: ListFragment)

    private val list = listOf(
        PageData("Android", ListFragment.newInstance("Android")),
        PageData("Kotlin", ListFragment.newInstance("Kotlin")),
        PageData("Flutter", ListFragment.newInstance("Flutter"))
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar_layout)
        viewpager.adapter = object: FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment = list[position].fragment

            override fun getCount(): Int = list.size

            override fun getPageTitle(position: Int): CharSequence? = list[position].title

        }
        tablayout.setupWithViewPager(viewpager)

        appbar.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener{
            override fun onOffsetChanged(appbarLayout: AppBarLayout, verticalOffset: Int) {
                val totalScrollRange = appbarLayout.totalScrollRange
                Log.d(TAG, "verticalOffset = $verticalOffset, totalScrollRange = $totalScrollRange")
            }
        })
    }


}
