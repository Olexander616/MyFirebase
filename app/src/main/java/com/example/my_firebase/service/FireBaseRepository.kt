package com.example.my_firebase.service

import android.content.Context
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class FireBaseRepository {
    private val auth = FirebaseAuth.getInstance()

    fun createUser(email: String, pass: String, context: Context){
        auth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(context,"Ok",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context,"Error",Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun sunInUser(email: String, pass: String, context: Context){
        auth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(context,"Ok",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context,"Error",Toast.LENGTH_SHORT).show()
                }
            }
    }

    //fun LogOut(email: String, pass: String, context: Context) {
      fun LogOut(){
        auth.signOut()
    }
}