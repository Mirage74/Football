package com.balex.football.domain

import com.balex.football.domain.entity.League

interface Repository {
    fun getTopLeaguesList(): List<League>
    fun getAvailableYears(): List<Int>
}