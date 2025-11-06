package com.example.aplikasiandroidpertama

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputUsername = findViewById<EditText>(R.id.EditTextUsername)
        val inputPassword = findViewById<EditText>(R.id.EditTextPassword)

        val buttonSubmit = findViewById<Button>(R.id.buttonsubmit)


        var username = inputUsername. text.toString()
        var password = inputPassword. text.toString()

        if(username.isEmpty() || password.isEmpty()) {
            Toast.makeText(
                this, "Username/Password tidak boleh kosong",
                Toast.LENGTH_LONG)
                .show()
        }else{
            Toast.makeText(this, "proces login..",
            Toast.LENGTH_LONG)
                .show()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}