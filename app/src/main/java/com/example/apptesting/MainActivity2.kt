package com.example.apptesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptesting.databinding.ActivityMain2Binding
import com.example.apptesting.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}