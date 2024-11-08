package com.example.tpadapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv: ListView = findViewById(R.id.lV)
        val languages = listOf("Java", "C#", "Python", "Kotlin", "Swift")
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, languages)
//        lv.adapter = adapter
//        lv.choiceMode = ListView.CHOICE_MODE_SINGLE


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, languages)
        lv.adapter = adapter
        lv.choiceMode = ListView.CHOICE_MODE_MULTIPLE
    }
}

