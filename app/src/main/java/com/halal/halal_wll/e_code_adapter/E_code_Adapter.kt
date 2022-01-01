package com.halal.halal_wll.e_code_adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_wll.R
import com.halal.halal_wll.model.E_code

class E_code_Adapter(val context: Context): RecyclerView.Adapter<E_code_Adapter.EcodeViewHolder>() {
    private var listOfEcode: List<E_code> = emptyList()
    class EcodeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textdescription: TextView = itemView.findViewById(R.id.txtDescription)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): E_code_Adapter.EcodeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_e_cod, parent, false)
        return EcodeViewHolder(view)
    }

    override fun onBindViewHolder(holder: E_code_Adapter.EcodeViewHolder, position: Int) {
        val list =listOfEcode [position]
        holder.textdescription.text = list.textdescription
    }

    override fun getItemCount(): Int {
        return listOfEcode.size
    }
    fun setListOfE_code(listOfCountry: List<E_code>) {
        this.listOfEcode = listOfEcode
        notifyDataSetChanged()
    }
}