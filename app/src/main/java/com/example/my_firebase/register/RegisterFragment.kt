package com.example.my_firebase.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.my_firebase.R
import com.example.my_firebase.databinding.FragmentRegisterBinding
import com.example.my_firebase.databinding.FragmentStartBinding


class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private lateinit var viewModel: RegisterViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_register, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[RegisterViewModel::class.java]
    }

    override fun onStart() {
        super.onStart()
        binding.btnRegoster.setOnClickListener{
            viewModel.registerNewUser(
                binding.etEmail.text.toString(),
                binding.etPassword.text.toString(),
                requireContext()
            )
            findNavController().navigate(R.id.action_registerFragment_to_startFragment)

        binding.tvLogIn.setOnClickListener{
            findNavController().popBackStack()
        }
        }
    }
}