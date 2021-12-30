package com.halal.halal_wll.startadapter

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_wll.MainActivity.ChooseActivity
import com.halal.halal_wll.R
import com.halal.halal_wll.model.Language

class LanguageAdapter(val context: Context)
    : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()  {
    private var listOfLanguage: List<Language> = emptyList()
    private var count = 0

    fun setListOfLanguage(listOfLanguage: List<Language>) {
        this.listOfLanguage = listOfLanguage
        notifyDataSetChanged()
    }
    class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameOfLanguage: TextView = itemView.findViewById(R.id.text_language)
        val checkBoxOfLanguage: ImageView = itemView.findViewById(R.id.checkbox_language)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_language, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val language = listOfLanguage[position]
        holder.nameOfLanguage.text = language.nameOfLanguage
        holder.itemView.setOnClickListener {
            count += 1
            holder.checkBoxOfLanguage.setBackgroundResource(R.drawable.check)
            Handler().postDelayed({
                val intent = Intent(context, ChooseActivity::class.java)
                intent.putExtra("nameOfLanguage", language.nameOfLanguage)
                context.startActivity(intent)

            }, 700)
        }

        if (count % 2 == 0) {
            holder.checkBoxOfLanguage.setBackgroundResource(R.drawable.ic_ellipse)
            count = 0
        }
    }

    override fun getItemCount(): Int {
        return listOfLanguage.size
    }
}