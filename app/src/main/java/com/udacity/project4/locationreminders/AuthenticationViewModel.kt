package com.udacity.project4.locationreminders

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.udacity.project4.FirebaseUserLiveData

class AuthenticationViewModel: ViewModel() {
    val authenticationState = FirebaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.Authenticated
        } else {
            AuthenticationState.Unauthenticated
        }
    }

    enum class AuthenticationState {
        Authenticated, Unauthenticated
    }
}