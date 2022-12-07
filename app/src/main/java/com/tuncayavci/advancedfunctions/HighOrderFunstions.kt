package com.tuncayavci.advancedfunctions

fun main(){
    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)

    val filterAndMapList = myNumberList.filter { it < 10 }.map { it * it }
    for (num in filterAndMapList){
        println(num)
    }

    val musicians = listOf<Musicians>(
        Musicians("James",66,"Guitar"),
        Musicians("Kirk",55,"Drum"),
        Musicians("Lars",60,"Guitar")
    )

    val filteredMusicians = musicians.filter { musicians -> musicians.age < 62 }
        .map { musicians -> musicians.instrument  }
    for (element in filteredMusicians){
        println(element)
    }

}

class Musicians (val name: String, val age: Int, val instrument: String)