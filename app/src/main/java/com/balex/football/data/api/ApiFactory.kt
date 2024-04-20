package com.balex.football.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    const val BASE_URL = "https://api-football-v1.p.rapidapi.com/v3/"
    const val BASE_URL_PLAYERS = "https://v3.football.api-sports.io/"

    private val interceptor = initInterceptor()

    private fun initInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    val client = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()


    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL).client(client)

        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)


    val retrofitPlayers = Retrofit.Builder()
        .baseUrl(BASE_URL_PLAYERS).client(client)

        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()

    val apiServicePlayers: ApiService = retrofitPlayers.create(ApiService::class.java)
}