package com.balex.football.domain.entity

import com.google.gson.annotations.SerializedName

data class playerOne (
    @SerializedName("response")
    val player: player,
    val statistics: statistics
)
//
//
//
//"response": [
//{
//    "player": {
//    "id": 883,
//    "name": "L. Grant",
//    "firstname": "Lee",
//    "lastname": "Grant",
//    "age": 39,
//    "birth": {
//    "date": "1983-01-27",
//    "place": "Hemel Hempstead",
//    "country": "England"
//},
//    "nationality": "England",
//    "height": "193 cm",
//    "weight": "83 kg",
//    "injured": false,
//    "photo": "https://media.api-sports.io/football/players/883.png"
//},
//    "statistics": [
//    {
//        "team": {
//        "id": 33,
//        "name": "Manchester United",
//        "logo": "https://media.api-sports.io/football/teams/33.png"
//    },
//        "league": {
//        "id": 39,
//        "name": "Premier League",
//        "country": "England",
//        "logo": "https://media.api-sports.io/football/leagues/39.png",
//        "flag": "https://media.api-sports.io/flags/gb.svg",
//        "season": 2020
//    },
//        "games": {
//        "appearences": 0,
//        "lineups": 0,
//        "minutes": 0,
//        "number": null,
//        "position": "Goalkeeper",
//        "rating": null,
//        "captain": false
//    },
//        "substitutes": {
//        "in": 0,
//        "out": 0,
//        "bench": 6
//    },
//        "shots": {
//        "total": null,
//        "on": null
//    },
//        "goals": {
//        "total": 0,
//        "conceded": 0,
//        "assists": null,
//        "saves": null
//    },
//        "passes": {
//        "total": null,
//        "key": null,
//        "accuracy": null
//    },
//        "tackles": {
//        "total": null,
//        "blocks": null,
//        "interceptions": null
//    },
//        "duels": {
//        "total": null,
//        "won": null
//    },
//        "dribbles": {
//        "attempts": null,
//        "success": null,
//        "past": null
//    },
//        "fouls": {
//        "drawn": null,
//        "committed": null
//    },
//        "cards": {
//        "yellow": 0,
//        "yellowred": 0,
//        "red": 0
//    },
//        "penalty": {
//        "won": null,
//        "commited": null,
//        "scored": 0,
//        "missed": 0,
//        "saved": 0
//    }
//    }
//    ]
//},
//{
//    "player": {
//    "id": 3423,
//    "name": "C. Atsu",
//    "firstname": "Christian",
//    "lastname": "Atsu Twasam",
//    "age": 31,
//    "birth": {
//    "date": "1992-01-10",
//    "place": "Ada Foah",
//    "country": "Ghana"
//},
//    "nationality": "Ghana",
//    "height": "165 cm",
//    "weight": "65 kg",
//    "injured": false,
//    "photo": "https://media.api-sports.io/football/players/3423.png"
//},
//    "statistics": [
//    {
//        "team": {
//        "id": 34,
//        "name": "Newcastle",
//        "logo": "https://media.api-sports.io/football/teams/34.png"
//    },
//        "league": {
//        "id": 39,
//        "name": "Premier League",
//        "country": "England",
//        "logo": "https://media.api-sports.io/football/leagues/39.png",
//        "flag": "https://media.api-sports.io/flags/gb.svg",
//        "season": 2020
//    },
//        "games": {
//        "appearences": 0,
//        "lineups": 0,
//        "minutes": 0,
//        "number": null,
//        "position": "Midfielder",
//        "rating": null,
//        "captain": false
//    },
//        "substitutes": {
//        "in": 0,
//        "out": 0,
//        "bench": 0
//    },
//        "shots": {
//        "total": null,
//        "on": null
//    },
//        "goals": {
//        "total": 0,
//        "conceded": null,
//        "assists": null,
//        "saves": null
//    },
//        "passes": {
//        "total": null,
//        "key": null,
//        "accuracy": null
//    },
//        "tackles": {
//        "total": null,
//        "blocks": null,
//        "interceptions": null
//    },
//        "duels": {
//        "total": null,
//        "won": null
//    },
//        "dribbles": {
//        "attempts": null,
//        "success": null,
//        "past": null
//    },
//        "fouls": {
//        "drawn": null,
//        "committed": null
//    },
//        "cards": {
//        "yellow": 0,
//        "yellowred": 0,
//        "red": 0
//    },
//        "penalty": {
//        "won": null,
//        "commited": null,
//        "scored": null,
//        "missed": null,
//        "saved": null
//    }
//    }
//    ]
//}
//]