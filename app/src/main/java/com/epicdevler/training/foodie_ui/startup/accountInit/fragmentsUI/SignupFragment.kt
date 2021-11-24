package com.epicdevler.training.foodie_ui.startup.accountInit.fragmentsUI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.epicdevler.training.foodie_ui.databinding.SignupFragmentLayoutBinding

class SignupFragment : Fragment() {

    private lateinit var binding: SignupFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = SignupFragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

}