package com.example.laravel_crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teacherButton: Button = findViewById(R.id.teacher)
        val studentButton: Button = findViewById(R.id.student)

        teacherButton.setOnClickListener {
            // Start TeacherActivity when teacher button is clicked
            val intent = Intent(this, TeacherActivity::class.java)
            startActivity(intent)
        }

        studentButton.setOnClickListener {
            // Start StudentActivity when student button is clicked
            val intent = Intent(this, StudentActivity::class.java)
            startActivity(intent)
        }
    }
}