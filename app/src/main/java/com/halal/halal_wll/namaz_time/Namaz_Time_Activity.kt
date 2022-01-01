package com.halal.halal_wll.namaz_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.halal.halal_wll.Namaz_ViewPagerAdapter.ViewPagerAdaper
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.ActivityChooseBinding.inflate
import com.halal.halal_wll.databinding.ActivityMainBinding.inflate
import com.halal.halal_wll.main_halal_activity.Main_Halal_Activity
import com.halal.halal_wll.namaz_fragment.*
import kotlinx.android.synthetic.main.activity_namaz_time.*

class Namaz_Time_Activity : AppCompatActivity() {
      private lateinit var binding: Namaz_Time_Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namaz_time)
        btn_back_main.setOnClickListener {backButton()}
        val view_pager: ViewPager2 = findViewById(R.id.view_pager)
        val fragments:ArrayList<Fragment> = arrayListOf(
         BagymdatFragment(),Kundun_shyguusu_Fragment(),
            Beshim_Fragment(),Asr_Fragment(),
            Sham_Fragment(),Kuptan_Fragment(),
            Tahajjud_Fragment()
        )
        val adapter = ViewPagerAdaper(fragments,this)
        view_pager.adapter = adapter
    }
    private fun backButton(){
        val intent = Intent(this,Main_Halal_Activity::class.java)
        startActivity(intent)
    }
}


