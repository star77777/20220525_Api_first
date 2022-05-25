package com.example.a20220525_api_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a20220525_api_first.databinding.ActivityMainBinding
import com.example.a20220525_api_first.utils.ServerUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        setupEvent()
        setValues()
    }
    fun setupEvent() {
        binding.loginBtn.setOnClickListener {
            val inputEmail = binding.emaileEdt.text.toString()
            val inputPw = binding.passwordEdt.text.toString()

            ServerUtil.postRequestLogin(inputEmail,inputPw)
        }
    }
        fun setValues(){


    }
}