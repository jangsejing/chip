package com.jess.chips

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //    private var layoutManager: GridLayoutManager? = null
    private var linearManager = LinearLayoutManager(this).apply {
        orientation = LinearLayoutManager.HORIZONTAL
    }
    private var flexManager = SafeFlexboxLayoutManager(this).apply {

    }

    private var adapter = SimpleAdapter()

    private var isFlag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = linearManager
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(
            DividerItemSpace(100)
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.change_layout -> {
//                if (layoutManager?.spanCount == 1) {
//                    layoutManager?.spanCount = 3
//                    item.title = "list"
//                } else {
//                    layoutManager?.spanCount = 1
//                    item.title = "grid"
//                }
//                layoutManager?.orientation = if (layoutManager?.orientation == LinearLayoutManager.VERTICAL) {
//                    LinearLayoutManager.HORIZONTAL
//                } else {
//                    LinearLayoutManager.VERTICAL
//                }
//                adapter?.notifyItemRangeChanged(0, adapter?.itemCount ?: 0)
                recyclerView.layoutManager =
                    if (recyclerView.layoutManager is LinearLayoutManager) {
                        flexManager
                    } else {
                        linearManager
                    }

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
