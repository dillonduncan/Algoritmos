package com.example.algoritmo01

fun main(){
    var abcdario: MutableList<Char> = mutableListOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
    var cont: Int=0
    var vocal:Char
    /*for (item in abcdario){
        if (item=='a' || item=='e' || item=='i' || item=='o' || item=='u'){
            println("epa")
            vocal=item
            println(item)
            abcdario.removeAll(setOf(vocal))
        }
    }
    for (i in abcdario){
        println(i)
    }*/
    for (i in 0..26){
        if (i==0 || i==3 || i==6 || i==12 || i==17){
            abcdario.removeAt(i)
        }

    }
    for (item in abcdario){
        println(item)
    }



}