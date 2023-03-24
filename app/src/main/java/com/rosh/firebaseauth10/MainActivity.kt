package com.rosh.firebaseauth10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.rosh.firebaseauth10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailLogin.setOnClickListener {
            var intent =Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        binding.numberLogin.setOnClickListener {
            var intent1 = Intent(this, MainActivity3::class.java)
            startActivity(intent1)
        }

    }

}