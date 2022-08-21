package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//this is where we handle user interaction ...xml file is how our layout looks like
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //user can tap button to chnage color of text label
        //1. add button to layout
        //2. know when user has tapped on button
        //3. change color fo text
        //reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //handle button click:change color
            Log.i("me", "tap on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))


        }
    }
}