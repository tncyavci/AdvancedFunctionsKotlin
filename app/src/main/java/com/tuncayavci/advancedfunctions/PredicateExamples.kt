package com.tuncayavci.advancedfunctions

fun main(){
    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)

    //Boolean
    val allCheck = myNumberList.all { it > 5}
    println(allCheck)

    //Boolean
    val anyCheck = myNumberList.any { it > 5 }
    println(anyCheck)

    //Int count of >5
    val totalCount = myNumberList.count { it > 5 }
    println(totalCount)

    //int first element > 5
    val findNumber = myNumberList.find { it > 5 }
    println(findNumber)

    //find last number >5
    val findLastNum = myNumberList.findLast { it > 5 }
    println(findLastNum)

    val myPredicate = { num : Int -> num > 5}
    val allCheckWithPredicate = myNumberList.all(myPredicate)
    println(allCheckWithPredicate)
}