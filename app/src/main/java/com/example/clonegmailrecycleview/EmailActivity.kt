package com.example.clonegmailrecycleview

import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.media.MediaRouter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clonegmailrecycleview.repository.fakeEmails
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class EmailActivity : AppCompatActivity() {


    private lateinit var adapter:EmailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//O adapter nada mais é que um padrão de projeto “design pattern”
// Utilizado para converter uma interface possibilitando seu funcionamento com outra
// Não algo exclusivo para o RecyclerView.
        adapter = EmailAdapter(fakeEmails())
        recyclerViewMain.adapter = adapter
        recyclerViewMain.layoutManager = LinearLayoutManager(this)

        val helper = androidx.recyclerview.widget.ItemTouchHelper(
            ItemTouchHelper(
                androidx.recyclerview.widget.ItemTouchHelper.UP
                        or androidx.recyclerview.widget.ItemTouchHelper.DOWN,
                androidx.recyclerview.widget.ItemTouchHelper.LEFT
            )
        )
        helper.attachToRecyclerView(recyclerViewMain)

    }

    inner class ItemTouchHelper(dragDirs: Int, swipeDirs: Int) :
        androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback(
            dragDirs, swipeDirs
        ) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            val from: Int = viewHolder.adapterPosition
            val to: Int = target.adapterPosition
            Collections.swap(adapter.emails, from, to)
            adapter.notifyItemMoved(from, to)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            TODO("Not yet implemented")
        }
    }


}