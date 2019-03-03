package com.example.deeplinknavigation

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

class Login : BaseFragment() {
    val userModel: UserViewModel by lazy { ViewModelProviders.of(activity as FragmentActivity).get(UserViewModel::class.java) }
    override fun onTextClicked() {
        super.onTextClicked()
        userModel.isUserLoggedIn = true
        findNavController().popBackStack(R.id.splash, true)
    }
}