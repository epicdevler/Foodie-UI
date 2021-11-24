package com.epicdevler.training.foodie_ui.startup.accountInit.fragmentsUI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.epicdevler.training.foodie_ui.R
import com.epicdevler.training.foodie_ui.databinding.LoginFragmentLayoutBinding

class LoginFragment : Fragment() {

    private lateinit var binding: LoginFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LoginFragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

}