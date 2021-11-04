package com.example.clonegmailrecycleview

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView.*
import com.example.clonegmailrecycleview.repository.Email
import kotlinx.android.synthetic.main.listemails.view.*


//Então o RecyclerView requisita essas views criadas pelo view holder e as associa ao seu objeto da lista.
class EmailAdapter(val emails: MutableList<Email>) : Adapter<EmailAdapter.EmailViewHolder>() {
    inner class EmailViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(email: Email) {
            with(email) {
                itemView.text_user.text = user.first().toString()
                itemView.text_user.background = itemView.oval(Color.rgb(16,8,0))
                itemView.text_remetente.text = user
                itemView.text_subject.text = subject
                itemView.text_content.text = preview
                itemView.text_date.text = date
            }
        }
    }

    fun View.oval(@ColorInt color: Int): ShapeDrawable {
        val oval = ShapeDrawable(OvalShape())
        with(oval) {
            intrinsicHeight=text_user.height
            intrinsicWidth=text_user.width
            paint.color=color
        }
        return oval
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listemails, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount(): Int = emails.size
}