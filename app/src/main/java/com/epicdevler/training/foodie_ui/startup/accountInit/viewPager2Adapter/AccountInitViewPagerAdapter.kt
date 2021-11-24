package com.epicdevler.training.foodie_ui.startup.accountInit.viewPager2Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.epicdevler.training.foodie_ui.startup.accountInit.fragmentsUI.LoginFragment
import com.epicdevler.training.foodie_ui.startup.accountInit.fragmentsUI.SignupFragment

class AccountInitViewPagerAdapter(fragment: FragmentManager, lifecycle : Lifecycle) : FragmentStateAdapter(fragment, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> SignupFragment()
            else -> LoginFragment()
        }
    }
}