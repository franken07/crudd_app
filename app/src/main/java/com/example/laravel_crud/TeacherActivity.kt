package com.example.laravel_crud

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TeacherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)

        // Display a welcome message for the teacher
        val welcomeMessage = "Welcome Teacher!"
        showToast(welcomeMessage)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}