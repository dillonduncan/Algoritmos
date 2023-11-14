package com.example.algoritmo01
fun main(){
    var opc:Int=1
    while (opc!=0){
        println("1: Agregar empleado")
        println("2: Mostrar empleados")
        println("3: Mostrar salario promedio")
        println("0: SALIR")
        print("Opcion: ")
        opc= readln().toInt()
        if (opc==1){
           Aggempleado()
        }
        else if (opc==2){
            GestorEmpleado().MostrarEmpleados()
            println(edades)
            println(salarios)
        }
        else if(opc==3){
            GestorEmpleado().CalcSalProm()
        }
        else if(opc==0){
            break
        }
    }

}
fun Aggempleado(){
    print("Nombre del empleado: ")
    var empleado:String = readln()
    GestorEmpleado().AggEmpleado(empleado)
    print("Edad del empleado: ")
    var edad:Int = readln().toInt()
    GestorEmpleado().AggEdad(edad)
    print("Salario del empleado: ")
    var salario:Double = readln().toDouble()
    GestorEmpleado().AggSalario(salario)
}
var empleados:MutableList<String> = mutableListOf("Dillon","Junior")
var edades:MutableList<Int> = mutableListOf(17,19)
var salarios:MutableList<Double> = mutableListOf(10000000.00,1500000.00)
class GestorEmpleado(){
    fun AggEmpleado(empleado:String){
        empleados.add(empleado)
    }
    fun MostrarEmpleados(){
        println(empleados)
    }
    fun AggEdad(edad:Int){
        edades.add(edad)
    }
    fun AggSalario(salario:Double){
        salarios.add(salario)
    }
    fun CalcSalProm(){
        var contador:Double=0.0
        var sals:Double=0.0
        for (i in salarios){
            contador++
            sals+=i
        }
        sals=sals/contador
        println("Salario promedio: $sals")
    }
}