package com.balex.football.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.balex.football.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://api-football-v1.p.rapidapi.com/v3/players?id=276&season=2020")
            .get()
            .addHeader("X-RapidAPI-Key", "3d3df3e10emsh9e37fc01a2d902cp11030ajsnb6bc6b355c41")
            .addHeader("X-RapidAPI-Host", "api-football-v1.p.rapidapi.com")
            .build()

        val response = client.newCall(request).execute()
    }
}