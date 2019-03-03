package com.example.deeplinknavigation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController

class Splash : BaseFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onTextClicked() {
        super.onTextClicked()
        findNavController().navigate(R.id.action_splash_to_login)
    }
}