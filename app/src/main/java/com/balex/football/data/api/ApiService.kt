package com.balex.football.data.api

import com.balex.football.API_KEY
import com.balex.football.API_KEY_PLAYERS
import com.balex.football.domain.entity.playerOne
import com.balex.football.domain.entity.response
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import java.util.Objects

interface ApiService {


//    @GET("leagues")
//    @Headers(
//        "X-RapidAPI-Key: $API_KEY",
//        "UX-RapidAPI-Host: api-football-v1.p.rapidapi.com"
//    )
//    suspend fun loadLeagues(
//    ): JSONObject

    @GET("players")
    @Headers(
        "X-RapidAPI-Key: $API_KEY_PLAYERS"
    )
    suspend fun getPlayers(
        @Query("league") league: String,
        @Query("season") season: String
    ): response


    companion object {
        const val HEADER_NAME_API_KEY = "X-RapidAPI-Key"
        const val HEADER_NAME_HOST = "X-RapidAPI-Host"
        const val HEADER_VALUE_HOST = "api-football-v1.p.rapidapi.com"
    }

}