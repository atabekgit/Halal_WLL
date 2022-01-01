package com.halal.halal_wll.startfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.halal.halal_wll.MainActivity.ChooseActivity
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.FragmentCountryBinding
import com.halal.halal_wll.model.Country
import com.halal.halal_wll.startadapter.CountryAdapter


class CountryFragment : Fragment() {
    private lateinit var binding: FragmentCountryBinding
    private lateinit var list:List<Country>
    private val adapter by lazy {
        CountryAdapter(requireContext())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(layoutInflater)
        binding.recyclerViewCountry.adapter = adapter
        binding.recyclerViewCountry.layoutManager = LinearLayoutManager(activity)
        list = ArrayList()
        list = list + Country("Кыргызстан")
        list = list + Country("Австралия")
        list = list + Country("Африка")
        list = list + Country("США")
        list = list + Country("Россия")
        list = list + Country("Северная Америка")
        list = list + Country("Южная Америка")
        adapter.setListOfCountry(list)
        binding.btnBackFromCountry.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_countryFragment_to_chooseFragment)
        }
        return binding.root
    }

}