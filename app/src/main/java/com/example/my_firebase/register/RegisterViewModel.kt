package com.example.my_firebase.register

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_firebase.service.FireBaseRepository
import kotlinx.coroutines.launch

class RegisterViewModel: ViewModel() {
    fun registerNewUser(email: String, pass: String, context: Context){
        viewModelScope.launch {
            FireBaseRepository().createUser(email,pass,context)
        }
    }
}