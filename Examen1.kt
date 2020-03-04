package model

fun main(args: Array<String>) {
    //Objeto de la clase auto
    var autos = Autos()
    var contador = 0
    //menú principal
    do {
        println("Que desea realizar 1.-Ensamblar auto, 2.-Ver autos ensamblados, 3.-Salir")
        var num: Int? = readLine()?.toInt()
        when(num)
        {
            //Manda llamar al metodo que ensamblará los autos
            1 -> {autos.ensamblarAuto()
                contador++
            }
            //Manda llamar el metodo para mostrar los datos
            2 -> {autos.verAutos()
            println("Cantidad de autos ensamblados: " + contador)
            }
        }
    }while (num != 3)
}
//Clase Auto
 class Autos() {
    //Atributos de la clase
    var marca:String =""
     get() = field
     set(value) {field = value}
    var modelo:String=""
        get() = field
        set(value) {field = value}
     val coches = mutableListOf<String>();
    //Método
     fun ensamblarAuto(){
         println("Escriba la marca del auto")
          marca = readLine().toString()
         println("Escriba el modelo del auto")
         modelo = readLine().toString()
        //variables auxiliares
         var manual=""
         var automatica=""
         var aire=""
         var frenos=""
         var bolsas=""
         var pantalla=""
         var controles=""
         do {
             println("Ingresa alguna(s) caracteristicas\n1.-Transmisión Manual\n2.-Transmisión Automática\n3.-Aire acondicionado\n4.-Frenos ABS\n5.-Bolsas de aire\n6.-Pantalla táctil\n7.-Controles eléctricos\n8.-Continuar")
             var numm = readLine()?.toInt() as Int
             when(numm)
             {
                 1 -> manual = "si"
                 2 -> automatica ="si"
                 3 -> aire = "si"
                 4 -> frenos = "si"
                 5 -> bolsas = "si"
                 6 -> pantalla = "si"
                 7 -> controles = "si"
             }
         }while (numm != 8)
        //variables auxiliares
         var niebla=""
         var led=""
         var asientos=""
         var rines=""
         var cargador=""
         var camara=""
         var monitoreo=""
         do {
             println("Ingresa alguna(s) caracteristicas especiales\n1.-Faros de niebla\n2.-Faros LED\n3.-Asientos de piel\n4.Rines de 17 pulgadas\n5.-Cargador inalámbrico\n6.-Cámara de reversa\n7.-Monitoreo punto ciego\n8.-Continuar")
             var numm = readLine()?.toInt() as Int
             when(numm)
             {
                 1 -> niebla = "si"
                 2 -> led ="si"
                 3 -> asientos = "si"
                 4 -> rines = "si"
                 5 -> cargador = "si"
                 6 -> camara = "si"
                 7 -> monitoreo = "si"
             }
         }while (numm != 8)
        //Almacena los datos obtenidos en la lista
         coches.addAll(listOf("\nMarca: $marca"+"\nModelo: $modelo"+
                 "\n\nCaracteristicas:"+"\nTransmisión Manual: $manual" + "\nTransmisión Automática: $automatica "+"\nAire Acondicionado: $aire"+"\nFrenos ABS: $frenos"+"\nBolsas de aire: $bolsas"+"\nPantalla táctil: $pantalla"+"\nControles Eléctricos: $controles"+
                 "\n\nCaracteristicas especiales:"+"\nFaros de niebla: $niebla" + "\nFaros LED: $led "+"\nAsientos de piel: $asientos"+"\nRines de 17 pulgadas: $rines"+"\nCargador inalámbrico: $cargador"+"\nCámara de reversa: $camara"+"\nMonitoreo punto ciego: $monitoreo"+"\n"))
     }
    //método
     fun verAutos() {
         println(coches)
     }
}