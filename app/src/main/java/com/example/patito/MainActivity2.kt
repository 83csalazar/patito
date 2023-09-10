package com.example.patito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ratingBar:RatingBar = findViewById(R.id.ratingBar)
        val progressBar:ProgressBar = findViewById(R.id.progressBar)
        //
        val rating = ratingBar.rating
        ratingBar.numStars = 5
        ratingBar.setOnRatingBarChangeListener { _,rating, _ ->
            Toast.makeText(this,"calificacion: $rating",Toast.LENGTH_LONG)

        }
        //barra d eprogreso

        progressBar.progress = 50
        progressBar.visibility = View.VISIBLE



    }
}