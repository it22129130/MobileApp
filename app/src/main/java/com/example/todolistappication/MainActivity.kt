package com.example.todolistappication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView :TextView=findViewById(R.id.textView)
        val button:Button=findViewById(R.id.button)

       CoroutineScope(Dispatchers.Main).launch {
           counter(textView)
       }

        button.setOnClickListener{

            runBlocking {
                delay(3000)

            }
            Toast.makeText(this,"This a button click",Toast.LENGTH_LONG).show()
        }
    }

    private suspend fun counter (view: TextView){
        var x=0

        while (true){
            view.text=x.toString()
            delay(1000)
            x++
        }
    }
}