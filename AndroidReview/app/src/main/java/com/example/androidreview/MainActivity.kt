package com.example.androidreview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidreview.rxjava2.Rxjava2Activity
import kotlinx.android.synthetic.main.activity_main.*


const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rxjava2.setOnClickListener {
            startActivity(Intent(this, Rxjava2Activity::class.java))
        }

    }
}