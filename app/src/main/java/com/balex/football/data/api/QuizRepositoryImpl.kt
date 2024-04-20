package com.balex.football.data.api

import com.balex.football.domain.Repository
import com.balex.football.domain.entity.League

class RepositoryImpl () : Repository {


    override fun getTopLeaguesList(): List<League> {
        val list = ArrayList<League>()
        list.add(League(39, "Premier League", "England"))
        list.add(League(140, "Primera Division", "Spain"))
        list.add(League(135, "Serie A", "Italy"))
        list.add(League(78, "Bundesliga 1", "Germany"))
        list.add(League(61, "Ligue 1", "France"))
        list.add(League(88, "Eredivisie", "Netherlands"))
        list.add(League(94, "Primeira Liga", "Portugal"))
        return list
    }

    override fun getAvailableYears(): List<Int> {
        return listOf(2020, 2021, 2022, 2023, 2024)
    }
}