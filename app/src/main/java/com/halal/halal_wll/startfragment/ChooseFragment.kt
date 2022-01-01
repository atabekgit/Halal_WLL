package com.halal.halal_wll.startfragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.halal.halal_wll.MainActivity.ChooseActivity
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.FragmentChooseBinding
import com.halal.halal_wll.main_halal_activity.Main_Halal_Activity
import com.halal.halal_wll.startadapter.CountryAdapter


class ChooseFragment : Fragment() {
    private lateinit var binding: FragmentChooseBinding

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
        binding = FragmentChooseBinding.inflate(layoutInflater)
        binding.btnCountry.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_chooseFragment_to_languageFragment)
        }
        binding.btnLanguage.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_chooseFragment_to_languageFragment)
        }
        binding.btnNext.setOnClickListener {
            val intent = Intent(activity?.application, Main_Halal_Activity::class.java)
            startActivity(intent)
            (activity as Activity?)!!.overridePendingTransition(0, 0)
        }
        return binding.root
    }
    }


