package com.example.weatherapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    private lateinit var et: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }


    fun clickCity(view: View){
        et = findViewById<View>(R.id.editCity) as EditText
        et.setText("")

    }

    fun goToMain(view: View){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("city", et.text )
        startActivity(intent)
    }

}