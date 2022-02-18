package com.gonzalo.disneyteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.gonzalo.disneyteam.databinding.ActivityMainBinding
import com.gonzalo.disneyteam.model.DisneyProvider.Companion.disney


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"OnStart",Toast.LENGTH_LONG).show();
       // val ar = findViewById<AspectRatioImageView>(R.id.arImagen)
        val rv = binding.rvMiembros
        rv.adapter = AdaptadorDisney(disney)
        rv.layoutManager = LinearLayoutManager(this)


    }

    override fun onPause() {
        super.onPause()
            Toast.makeText(this,"OnPause",Toast.LENGTH_LONG).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG).show();
    }



    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"OnStop",Toast.LENGTH_LONG).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_LONG).show();
    }



}