package com.example.listviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var listview: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.text)
        listview=findViewById(R.id.lv)

        //initialiser une liste de couleurs :les donnees
        val colors=listOf ("red","yellow","Blue","purple","black","")
        //create an array
        val adapter= ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            colors //liste de donnees

        )
        listview.adapter=adapter
    }
}