package com.example.mvi

sealed class LoginIntent {
    object ChangeText : LoginIntent()
}
