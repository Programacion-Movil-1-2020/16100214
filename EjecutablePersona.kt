package model

fun main (){
    //Introducimos los datos
    print("Introduce el nombre")
    var nombre:String? = readLine().toString()
    print("Introduce la edad")
    var edad:Int? = readLine()!!.toInt()
    print("Introduce el sexo colocando una M para mujer o una H para hombre")
    var sexo:Char? = readLine()!!.toCharArray() [0]
    print("Introduce el peso")
    var peso:Double? = readLine()!!.toDouble()
    print("Introduce la altura")
    var altura:Double? = readLine()!!.toDouble()

    //Se crea el objeto y se almacenan los datos
    var persona = Persona(nombre!!,edad!!.toInt(),sexo!!.toChar(),peso!!.toDouble(),altura!!.toDouble())
    /*var persona2 = Persona(nombre!!,edad!!.toInt(),sexo!!.toChar())
    var persona3 = Persona()*/

    //Funcion para mostrar el mensaje del peso
    fun MuestraMensajePeso(): String {
        var IMC = persona.calcularIMC()
        //var IMC2 = persona2.calcularIMC()
        //var IMC3 = persona3.calcularIMC()
        var mensaje: String = ""
        when (IMC /*or IMC2 or IMC3*/){
            persona.sobrePeso -> mensaje = "Tiene sobre peso"
            /*persona2.sobrePeso -> mensaje = "Tine sobre peso"
            persona3.sobrePeso -> mensaje = "Tine sobre peso"*/
            persona.debajoPesoIdeal -> mensaje = "Esta por debajo del peso ideal"
            /*persona2.debajoPesoIdeal -> mensaje = "Esta por debajo del peso ideal"
            persona3.debajoPesoIdeal -> mensaje = "Esta por debajo del peso ideal"*/
            persona.pesoIdeal -> mensaje = "Tiene el peso ideal"
            /*persona2.pesoIdeal -> mensaje = "Tiene el peso ideal"
            persona3.pesoIdeal -> mensaje = "Tiene el peso ideal"*/
        }
        return mensaje
    }

    //Funcion para mostrar mensaje de si es o no es mayor de edad
    fun  MuestraMayorEdad():String {
        var mensaje:String = ""
        if (persona.esMayorDeEdad()/* or persona2.esMayorDeEdad() or persona3.esMayorDeEdad()*/)
            mensaje = "Es mayor de edad"
        else
            mensaje = "No es mayor de edad"

        return mensaje
    }

    //Funcion para comprobar el sexo de la persona
    fun ComprobarSexo():String {
        var mensaje:String = ""
        if (persona.comprobarSexo()/* or persona2.comprobarSexo() or persona3.comprobarSexo()*/)
            mensaje = "Es mujer"
        else
            mensaje = "Es hombre"
        return mensaje
    }

    //Imprime todos los datos de la persona
    println("Primera persona\n"+ persona.toString() +"\n"+ MuestraMensajePeso() + "\n"+MuestraMayorEdad()+"\n"+ComprobarSexo())
    /*println("Segunda persona\n"+ persona.toString() +"\n"+ MuestraMensajePeso() + "\n"+MuestraMayorEdad()+"\n"+ComprobarSexo())
    println("Tercera persona\n"+ persona.toString() +"\n"+ MuestraMensajePeso() + "\n"+MuestraMayorEdad()+"\n"+ComprobarSexo())*/
}