package com.wonyoung.carrotmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.ArrayAdapter as ArrayAdapter1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = android.widget.ArrayAdapter.createFromResource(this,R.array.my_array,android.R.layout.simple_spinner_item)

    }
}