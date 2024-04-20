package com.balex.football.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.balex.football.databinding.ActivityMainBinding
import com.balex.football.data.api.ApiFactory.apiService
import com.balex.football.data.api.ApiFactory.apiServicePlayers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Default).launch {
            try {
                val data = apiServicePlayers.getPlayers("39", "2020")
                Log.d(TAG, data.toString())

            } catch (e: Exception) {
                Log.d(TAG, "error: $e")
            }
        }


    }
}