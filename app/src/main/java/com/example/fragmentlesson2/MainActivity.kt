package com.example.fragmentlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Activity with Fragment"

        //Button 1
        findViewById<Button>(R.id.button1).setOnClickListener{
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, Fragment1())
                .commit()
        }

        //Button 2
        findViewById<Button>(R.id.button2).setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, Fragment2())
                .commit()
        }
    }
}