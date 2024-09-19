package com.example.laba2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun Solve(view: View){

        val myNumberField = findViewById<EditText>(R.id.textNumber)
        val inputValue = myNumberField.text.toString().toInt()
        var i = 2
        var output = 1
        while (i<=128){
            output*=(inputValue - i)/(inputValue - (i-1))
            i*=2
        }
        Toast.makeText(this, output, Toast.LENGTH_SHORT).show()

    }
}