package com.example.deeplinknavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

class Collection : BaseFragment() {

    val userViewModel:UserViewModel by lazy { ViewModelProviders.of(activity as FragmentActivity).get(UserViewModel::class.java) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(!userViewModel.isUserLoggedIn) {
            findNavController().navigate(R.id.load_initial_data)
        }

    }
    override fun onTextClicked() {
        super.onTextClicked()
        findNavController().navigate(R.id.action_collection_to_product)
    }
}