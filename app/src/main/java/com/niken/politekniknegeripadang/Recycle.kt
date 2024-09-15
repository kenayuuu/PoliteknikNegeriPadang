package com.niken.politekniknegeripadang

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niken.politekniknegeripadang.adapter.GaleriAdapter
import com.niken.politekniknegeripadang.model.Mocklist
import com.niken.politekniknegeripadang.model.ModelGaleri

class Recycle : AppCompatActivity() {

    private lateinit var rv_gambar: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle)
        rv_gambar = findViewById(R.id.rv_gambar)

        val modelList = Mocklist.getModel()
        Log.d("Recycle", "Model list size: ${modelList.size}")

        rv_gambar.layoutManager = LinearLayoutManager(this)

        val adapter = GaleriAdapter(this, Mocklist.getModel() as ArrayList<ModelGaleri>)
        rv_gambar.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_gambar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
