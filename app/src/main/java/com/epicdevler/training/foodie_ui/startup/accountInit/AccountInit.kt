package com.epicdevler.training.foodie_ui.startup.accountInit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.epicdevler.training.foodie_ui.databinding.AccountInitActivityLayoutBinding
import com.epicdevler.training.foodie_ui.startup.accountInit.viewPager2Adapter.AccountInitViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class AccountInit : AppCompatActivity() {
    lateinit var binding: AccountInitActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AccountInitActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager2: ViewPager2 = binding.accountInitViewPager2
        viewPager2.adapter = AccountInitViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(binding.accountInitTab, viewPager2){tab, position ->
            tab.text = "Object ${(position + 1)}"
        }.attach()



    }
}