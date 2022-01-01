package com.halal.halal_wll.main_halal_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.halal.halal_wll.R
import com.halal.halal_wll.databinding.ActivityChooseBinding.inflate
import com.halal.halal_wll.databinding.ActivityEcodeMainBinding

class E_Code_MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEcodeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEcodeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBackMainEcode.setOnClickListener{backButton()}


    }
    private fun backButton(){
        val intent = Intent(this,Main_Halal_Activity::class.java)
        startActivity(intent)
    }

}