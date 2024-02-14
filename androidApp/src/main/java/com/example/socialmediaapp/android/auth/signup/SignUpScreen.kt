package com.example.socialmediaapp.android.auth.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SignUpScreen(
    modifier:Modifier=Modifier,
    uiState: SignUpUiState,
    onUsernameChange:(String)->Unit,
    onEmailChange:(String)->Unit,
    onPasswordChange:(String)->Unit,
){
  Column(
modifier=modifier
    .fillMaxSize()
  ){

  }
}

