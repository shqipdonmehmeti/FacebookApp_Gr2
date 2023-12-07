package com.example.facebookapp_gr2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.facebookapp_gr2.R
import com.example.facebookapp_gr2.databinding.ActivityMainBinding
import com.example.facebookapp_gr2.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            if (username == "yll" && password == "rexhepi"){
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentContainer, HomeFragment())
                    addToBackStack("")
                    commit()
                }
            }else{
                Toast.makeText(requireContext(), "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }


}