package com.example.loginpagev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginpagev1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val username = "testlogin"
        val password = "123"

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            loginButton.setOnClickListener {
                val inputUsername = usernameEditText.text.toString()
                val inputPassword = passwordEditText.text.toString()

                if (inputUsername == username && inputPassword == password) {
                    Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
                } else if (inputUsername != username || inputPassword != password) {
                    Toast.makeText(this@MainActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }
}