package com.wzc.coordinatorlayout.examples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_fab.*

class FABActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab)
        fab.setOnClickListener { Snackbar.make(fab, "Show the SnackBar",Snackbar.LENGTH_SHORT).show() }
    }
}
