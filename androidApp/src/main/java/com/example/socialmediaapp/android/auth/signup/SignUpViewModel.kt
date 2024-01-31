package com.example.socialmediaapp.android.auth.signup

import androidx.lifecycle.ViewModel

class SignUpViewModel:ViewModel() {
}

data class  SignUpState(
    var username: String = "",
    var email: String = "",
    var password: String = ""


)