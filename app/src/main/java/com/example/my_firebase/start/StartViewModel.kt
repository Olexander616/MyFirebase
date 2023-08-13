package com.example.my_firebase.start

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.my_firebase.service.FireBaseRepository

class StartViewModel: ViewModel() {
    //fun logOut(email: String, pass: String, context: Context){
    fun logOut(){
        FireBaseRepository().LogOut()
    }

}