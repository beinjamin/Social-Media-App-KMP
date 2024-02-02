package com.example.socialmediaapp.android.common.components

import androidx.annotation.StringRes
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.room.util.copy
import com.example.socialmediaapp.android.R
import com.example.socialmediaapp.android.common.theming.Gray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    isPasswordTextField: Boolean = false,
    isSingleLine: Boolean = true,
    @StringRes hint: Int
) {
    TextField(value=value,
        onValueChange=onValueChange,
        modifier=modifier.fillMaxHeight(),
        textStyle = MaterialTheme.typography.bodyLarge,
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType=keyboardType
        ),
        singleLine=isSingleLine,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = if (isSystemInDarkTheme()) {
                MaterialTheme.colorScheme.background
            } else {
                Gray
            },
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent
        ),

    )
}

@Composable
fun PasswordEyeIcon(
    isPasswordVisible:Boolean,
    onPasswordVisibilityToggle:()->Unit

){
    val image= if (isPasswordVisible){
        painterResource(id = R.drawable.show_eye_icon_filled)
    } else {
        painterResource(id = R.drawable.hide_eye_icon_filled)
    }

}