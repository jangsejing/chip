package com.jess.chips


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(
//        private val layoutManager: GridLayoutManager? = null
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    enum class ViewType {
        SMALL
//        ,
//        DETAILED
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return when (viewType) {
//            ViewType.DETAILED.ordinal -> DetailedViewHolder(parent)
//            else -> SimpleViewHolder(parent)
//        }
        return SimpleViewHolder(parent)
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
    }

    override fun getItemCount() = 5

    override fun getItemViewType(position: Int): Int {
//        return if (layoutManager?.spanCount == 1) ViewType.DETAILED.ordinal
//        else ViewType.SMALL.ordinal
        return ViewType.SMALL.ordinal
    }
}