package com.example.clonegmailrecycleview

import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clonegmailrecycleview.repository.fakeEmails
import kotlinx.android.synthetic.main.activity_main.*

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//O adapter nada mais é que um padrão de projeto “design pattern”
// Utilizado para converter uma interface possibilitando seu funcionamento com outra
// Não algo exclusivo para o RecyclerView.
        recyclerViewMain.adapter=EmailAdapter(fakeEmails())
        recyclerViewMain.layoutManager=LinearLayoutManager(this)
    }


}