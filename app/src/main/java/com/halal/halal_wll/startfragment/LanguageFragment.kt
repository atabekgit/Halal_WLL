package com.halal.halal_wll.startfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.halal.halal_wll.MainActivity.ChooseActivity
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.FragmentLanguageBinding
import com.halal.halal_wll.model.Language
import com.halal.halal_wll.startadapter.LanguageAdapter


class LanguageFragment : Fragment() {
    private lateinit var binding: FragmentLanguageBinding
    private lateinit var list:List<Language>
    private val adapter by lazy {
        LanguageAdapter(requireContext())
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(layoutInflater)
        binding.recyclerViewLanguage.adapter = adapter
        binding.recyclerViewLanguage.layoutManager = LinearLayoutManager(activity)
        list = ArrayList()
        list = list + Language("Кыргызча")
        list = list + Language("Русский")
        list = list + Language("English")
        list = list + Language("Арабский язык")
        adapter.setListOfLanguage(list)


        binding.btnBackFromLanguage.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_languageFragment_to_chooseFragment)
        }
        return binding.root
    }

}


