package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener { view ->
            val intent = Intent(this, CoronaActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener { view ->
            val intent = Intent(this, GejalaActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener { view ->
            val intent = Intent(this, PencegahanActivity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener { view ->
            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }
        }
    }

