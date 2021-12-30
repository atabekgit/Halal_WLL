package com.halal.halal_wll.namaz_time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.halal.halal_wll.Namaz_ViewPagerAdapter.ViewPagerAdaper
import com.halal.halal_wll.R
import com.halal.halal_wll.namaz_fragment.*
import kotlinx.android.synthetic.main.activity_namaz_time.*

class Namaz_Time_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namaz_time)
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
}