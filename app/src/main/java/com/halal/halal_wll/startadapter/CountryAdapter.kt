package com.halal.halal_wll.startadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_wll.R
import com.halal.halal_wll.model.Country

class CountryAdapter(requireContext: Context) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    private var listOfCountry: List<Country> = emptyList()
    var count: Int = 0
    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun getListOgCountry(position: Int):Country{
        return listOfCountry[position]
    }

    /*  fun setListener(listener: onItemClickListener) {
          this.listener = listener
      }*/

    fun setListOfCountry(listOfCountry: List<Country>) {
        this.listOfCountry = listOfCountry
        notifyDataSetChanged()
    }

    class CountryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val nameOfCountry: TextView = itemView.findViewById(R.id.text_country)
        val checkBoxCountry: RadioButton = itemView.findViewById(R.id.checkbox_country)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = listOfCountry[position]
        holder.nameOfCountry.text = country.nameOfCountry


        holder.checkBoxCountry.isChecked.and(false)
/*holder.itemView.setOnClickListener {

    count +=1
        Handler().postDelayed({
            val intent = Intent(context, ChooseActivity::class.java)
            intent.putExtra("nameOfCountry",country.nameOfCountry)
            context.startActivity(intent)
        }, 700)
    }

        if (count%2==0){
            holder.checkBoxCountry.setBackgroundResource(R.drawable.ic_ellipse)
        count = 0
        }*/

    }



    override fun getItemCount(): Int {
        return listOfCountry.size
    }
}