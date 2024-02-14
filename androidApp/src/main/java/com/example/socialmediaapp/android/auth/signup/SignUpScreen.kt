package com.example.socialmediaapp.android.auth.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.socialmediaapp.android.common.theming.ExtraLargeSpacing
import com.example.socialmediaapp.android.common.theming.LargeSpacing
import com.example.socialmediaapp.android.common.theming.MediumSpacing

@Composable
fun SignUpScreen(
    modifier:Modifier=Modifier,
    uiState: SignUpUiState,
    onUsernameChange:(String)->Unit,
    onEmailChange:(String)->Unit,
    onPasswordChange:(String)->Unit,
){
  Column(
     modifier= modifier
    .fillMaxSize()
    .verticalScroll(rememberScrollState())
    .background(
        color = if (isSystemInDarkTheme()){
            MaterialTheme.colorScheme.background
        }else{
            MaterialTheme.colorScheme.surface
        }
    )
         .padding(
             top= ExtraLargeSpacing+ LargeSpacing,
             start = LargeSpacing+ MediumSpacing,
             end = LargeSpacing + MediumSpacing,
             bottom = LargeSpacing
         ),

  )
  {

  }
}

