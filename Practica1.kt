fun main(arg: Array<String>) {
    var num: Int
    var procesador = ""
    var memoria = ""
    var tamaño = ""
    var tipo = ""
    var almacenamiento = ""
    var tarjeta = ""
    val PCS = mutableListOf<String>();
    do {
        print("Escoja una opción:\n" + "1.- Armar un nuevo equipo\n" + "2.- Ver equipos armados\n" + "3.- Salir\n ")
        num = readLine()?.toInt() as Int
        when (num) {
            1 -> {
                do {
                    print("Escoja un componente:\n" + "1.- Procesador\n" + "2.- Memoria Ram\n" + "3.- Disco duro (almacenamiento)\n" + "4.- Tarjeta Grafica\n" + "5.- Regresar\n")
                    num = readLine()?.toInt() as Int
                    when (num) {
                        1 -> {
                            print("Selecciona un procesador:\n" + "1.- Intel Core i3\n" + "2.- Intel Core i5\n" + "3.- Intel Core i7\n")
                            num = readLine()?.toInt() as Int
                            when (num){
                                1-> {procesador = "Intel Core i3"}
                                2-> {procesador = "Intel Core i5"}
                                3->{procesador = "Intel Core i7" }
                            }
                        }
                        2 -> {
                            print("Selecciona una memoria RAM:\n" + "1.- DDR\n" + "2.- DDR2\n" + "3.- DDR3\n" + "4.- DDR4\n")
                            num = readLine()?.toInt() as Int
                            when (num){
                                1-> {
                                    memoria = "DDR"
                                    print("Selecciona el tamaño de la RAM:\n" + "1.- 4GB\n" + "2.- 8GB\n" + "3.- 16GB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1->{tamaño = "4GB"}
                                        2->{tamaño = "8GB"}
                                        3->{tamaño = "16GB"}
                                    }
                                }
                                2-> {
                                    memoria = "DDR2"
                                    print("Selecciona el tamaño de la RAM:\n" + "1.- 4GB\n" + "2.- 8GB\n" + "3.- 16GB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1->{tamaño = "4GB"}
                                        2->{tamaño = "8GB"}
                                        3->{tamaño = "16GB"}
                                    }
                                }
                                3-> {
                                    memoria = "DDR3"
                                    print("Selecciona el tamaño de la RAM:\n" + "1.- 4GB\n" + "2.- 8GB\n" + "3.- 16GB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1->{tamaño = "4GB"}
                                        2->{tamaño = "8GB"}
                                        3->{tamaño = "16GB"}
                                    }
                                }
                                4-> {
                                    memoria = "DDR4"
                                    print("Selecciona el tamaño de la RAM:\n" + "1.- 4GB\n" + "2.- 8GB\n" + "3.- 16GB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1->{tamaño = "4GB"}
                                        2->{tamaño = "8GB"}
                                        3->{tamaño = "16GB"}
                                    }
                                }
                            }
                        }
                        3 -> {
                            print("Selecciona el tipo de disco duro:\n" + "1.- SSD\n" + "2.- HDD\n")
                            num = readLine()?.toInt() as Int
                            when (num){
                                1-> {
                                    tipo = "SSD"
                                    print("Selecciona el almacenamiento del disco duro:\n" + "1.- 512 GB \n" + "2.- 1TB\n" + "3.- 2TB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1-> {almacenamiento = "512 GB"}
                                        2-> {almacenamiento = "1TB"}
                                        3->{almacenamiento = "2TB" }
                                    }
                                }
                                2-> {
                                    tipo = "HDD"
                                    print("Selecciona el almacenamiento del disco duro:\n" + "1.- 512 GB \n" + "2.- 1TB\n" + "3.- 2TB\n")
                                    num = readLine()?.toInt() as Int
                                    when (num){
                                        1-> {almacenamiento = "512 GB"}
                                        2-> {almacenamiento = "1TB"}
                                        3->{almacenamiento = "2TB" }
                                    }
                                }
                            }

                        }
                        4 -> {
                            print(
                                "Selecciona una tarjeta grafica:\n" + "1.- Asus GeForce GT 1030 Silent\n" + "2.- Sapphire Pulse Radeon RX 550\n" + "3.- GT 1030 Low Profile 2G\n"
                            )
                            num = readLine()?.toInt() as Int
                            when (num){
                                1-> {tarjeta = "Asus GeForce GT 1030 Silent"}
                                2-> {tarjeta = "Sapphire Pulse Radeon RX 550"}
                                3->{tarjeta = "GT 1030 Low Profile 2G" }
                            }
                        }
                    }
                } while (num != 5)
            }
            2 -> {
                PCS.addAll(listOf("\n" + "#Procesador: " + procesador + " Tipo de memoria RAM: " + memoria + " Tamaño de la memoria RAM: " + tamaño +
                        " Tipo de disco duro: " + tipo + " Almacenamiento del disco duro: " + almacenamiento + " Tarjeta grafica: " + tarjeta +"\n"))
                println(PCS)
            }
        }
    }while (num != 3)
}
