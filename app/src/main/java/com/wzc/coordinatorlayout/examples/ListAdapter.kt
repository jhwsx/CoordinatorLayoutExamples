package com.wzc.coordinatorlayout.examples

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 *
 * @author wzc
 * @date 2019/7/14
 */
class ListAdapter(var title: String?): RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
     val list = arrayListOf<String>()
    init {
        for (i in 0 until 50) {
            list.add(title + i)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(TextView(parent.context))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        (holder.itemView as TextView).text = list[position]
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}