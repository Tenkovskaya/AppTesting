package com.example.apptesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import com.example.apptesting.databinding.ActivityMain2Binding
import com.example.apptesting.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var handler: Handler
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        handler= Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        },3000)
    }


}