package com.halal.halal_wll.main_halal_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.ActivityMainHalalActovityBinding
import com.halal.halal_wll.mainfragment.CatalogFragment
import com.halal.halal_wll.mainfragment.MainFragment
import com.halal.halal_wll.mainfragment.MenuFragment
import kotlinx.android.synthetic.main.activity_main_halal_actovity.*

class Main_Halal_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityMainHalalActovityBinding
    private val mainFragment = MainFragment()
    private val catologFragment = CatalogFragment()
    private val menuFragment = MenuFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainHalalActovityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        repelaceFragment(mainFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){

                R.id.catalogFragment ->repelaceFragment(catologFragment)
                R.id.mainFragment ->repelaceFragment(mainFragment)
                R.id.menuFragment ->repelaceFragment(menuFragment)
            }
            true

        }
    }
    private fun repelaceFragment(fragment: Fragment) {
        if (fragment != null){
            val transition = supportFragmentManager.beginTransaction()
            transition.replace(R.id.fragmentContainerView,fragment)
            transition.commit()
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
//atabek