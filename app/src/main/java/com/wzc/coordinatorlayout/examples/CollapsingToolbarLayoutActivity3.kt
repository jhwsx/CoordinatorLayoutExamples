package com.wzc.coordinatorlayout.examples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_collapsing_toolbar_layout_3.*

class CollapsingToolbarLayoutActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar_layout_3)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = ListAdapter("Item")
    }
}
