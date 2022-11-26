package com.example.myapplication

import com.example.myapplication.Travoyadnye
import com.example.myapplication.Plotoyadnye


fun main() {
    println("Cписок животных")

    val travoyadnye1 = Travoyadnye(vid = "Кролик",weight=5.67f)


    val travoyadnye2 = Travoyadnye(vid = "Лось",weight=110f)


    val plotoyadnye1 = Plotoyadnye(vid="Волк", weight=65f)


    val plotoyadnye2 = Plotoyadnye(vid="Лиса", weight=10.5f)


    var listOfAnimals=listOf(travoyadnye1.vid,travoyadnye2.vid,plotoyadnye1.vid,plotoyadnye2.vid)
    println(listOfAnimals)
}