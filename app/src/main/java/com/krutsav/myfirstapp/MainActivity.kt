package com.krutsav.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonVar = findViewById<Button>(R.id.button1);
        val myTextView = findViewById<TextView>(R.id.textView1);
        var count = 0;

        buttonVar.setOnClickListener {
            count += 1;
            buttonVar.text = "Click Me";
//            myTextView.text = "And now your text is gone";
            myTextView.text = count.toString();
            Toast.makeText(this,"Hehe! You clicked", Toast.LENGTH_SHORT).show();
        }
    }
}