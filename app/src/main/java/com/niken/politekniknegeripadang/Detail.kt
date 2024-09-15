package com.niken.politekniknegeripadang

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView: ImageView = findViewById(R.id.image_detail)

        val imageResId = intent.getIntExtra("image_res_id", -1)

        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}
