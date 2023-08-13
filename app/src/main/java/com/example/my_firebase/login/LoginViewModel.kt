package com.example.my_firebase.login

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_firebase.service.FireBaseRepository
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {
    fun loginUser(email: String, pass: String, context: Context){
        viewModelScope.launch {
            FireBaseRepository().sunInUser(email,pass,context)
        }
    }
}