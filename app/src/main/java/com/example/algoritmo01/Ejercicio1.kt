package com.example.algoritmo01
fun main(){
    print("Ingrese numero: ")
    var num : Int= readln().toInt()
    var cifras : Int=0
    var div : Int= 1
    var num2 : Int=num
    while(num>0){
        cifras++
        num=num/10
        if (cifras==2){
            div= 10
        }
        if(cifras>2){
            div=div*10
        }
        //println(div)
    }
    println("Cantidad de digitos: $cifras")
    var rslt : Int=0
    for (item in 1..cifras){
        //println(div)
        rslt=num2/div
       // println(num2)
        num2%=div
        println("Digito $item: $rslt")
        div/=10

    }
}