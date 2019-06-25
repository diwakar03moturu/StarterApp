package com.application.zomato.starter.activities

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.application.zomato.starter.R
import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Linking an xml layout to a view.
         */
        setContentView(R.layout.sample)

//        val textView = findViewById<TextView>(R.id.text)
//        textView.text = "Hey, There"
//        textView.setTextColor(Color.MAGENTA);
    }
}