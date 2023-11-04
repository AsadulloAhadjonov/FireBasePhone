package com.asadullo.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asadullo.firebase.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy{ActivityMain3Binding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val phoneNumber = intent.getStringExtra("phoneNumber2")
        binding.phoneNumber.text = phoneNumber
    }
}