package com.example.mvi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _state = MutableLiveData(LoginState())
    val state: LiveData<LoginState> = _state

    fun processIntent(intent: LoginIntent) {
        when (intent) {
            is LoginIntent.ChangeText -> {
                val newText = if (_state.value?.text == "Сәлем, әлем!") "Қош келдің!" else "Сәлем, әлем!"
                _state.value = LoginState(newText)
            }
        }
    }
}
