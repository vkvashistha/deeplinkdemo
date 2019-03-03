package com.example.deeplinknavigation

import androidx.navigation.fragment.findNavController

class Home : BaseFragment() {

    override fun onTextClicked() {
        super.onTextClicked()
        findNavController().navigate(R.id.action_home_to_collection)
    }
}