package com.example.socialmediaapp.android.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel:ViewModel() {
    var uiState by mutableStateOf(SignUpState())
    private set


    fun updateUsername(input: String){
        uiState = uiState.copy(username=input)
    }

    fun updateEmail(input: String){
        uiState = uiState.copy(email = input)
    }

    fun updatePassword(input: String){
        uiState = uiState.copy(password = input)
    }
}

data class  SignUpState(
    var username: String = "",
    var email: String = "",
    var password: String = ""


)