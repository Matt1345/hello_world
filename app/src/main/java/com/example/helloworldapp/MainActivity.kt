package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun update(view: View) {
        counter++
        val textView: TextView = findViewById(R.id.textView) as TextView
        val button: Button = findViewById(R.id.button) as Button

        if(counter % 2 == 0){
            textView.text = "Hello world"
            button.text = "Sakrij tekst"
        }

        else {
            textView.text = ""
            button.text = "Otkrij tekst"
        }

    }
}