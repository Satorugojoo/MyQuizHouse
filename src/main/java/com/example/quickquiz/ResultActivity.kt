package com.example.quickquiz


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quickquiz.databinding.ActivityResultBinding


private lateinit var binding: ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_result)
        val view = binding.root
        setContentView(view)

        val username = intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text = username
        val totalQuestions =intent.getIntExtra(Constants.Total_Questions,0)
        val correctAnswers = intent.getIntExtra(Constants.Correct_Answers,0)

        binding.tvScore.text = "Twój wynik to $correctAnswers z $totalQuestions pytań!!!"

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}