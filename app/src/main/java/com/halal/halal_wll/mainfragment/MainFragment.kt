package com.halal.halal_wll.mainfragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.FragmentMainBinding
import com.halal.halal_wll.main_halal_activity.E_Code_MainActivity
import com.halal.halal_wll.namaz_time.Namaz_Time_Activity
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(layoutInflater)
        binding.namazubakyty.setOnClickListener {
            val intent = Intent(activity?.application, Namaz_Time_Activity::class.java)
            startActivity(intent)
            (activity as Activity?)!!.overridePendingTransition(0, 0)
        }
        binding.ECod.setOnClickListener {
            val intent = Intent(activity?.application, E_Code_MainActivity::class.java)
            startActivity(intent)
            (activity as Activity?)!!.overridePendingTransition(0, 0)
        }

        return binding.root
    }


}
