package model
import kotlin.random.Random

class Persona {
    //Atributos
    var nombre: String = ""
    get() = field
    set(value) {
        field = value
    }
    var edad: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var dni: String = ""
        get() = field
        set(value) {
            field = value
        }
    var sexo: Char = 'M'
        get() = field
        set(value) {
            field = value
        }
    var peso: Double = 0.0
        get() = field
        set(value) {
            field = value
        }
    var altura: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    //Constructores
    constructor() {
        this.dni = generaDNI()
    }
    constructor(Nombre: String, Edad: Int,Sexo: Char):this(){
        nombre = Nombre
        edad = Edad
        sexo = Sexo
        dni = generaDNI()
    }
    constructor(Nombre: String, Edad: Int, Sexo: Char, Peso: Double, Altura: Double):this(){
        nombre = Nombre
        edad = Edad
        sexo = Sexo
        peso = Peso
        altura = Altura
        dni = generaDNI()
    }

    //Metodos
    //Calcula el IMC
    val sobrePeso = 1
    val debajoPesoIdeal = 0
    val pesoIdeal = -1
    fun calcularIMC(): Int {
        var pesoDevuelto: Int
        var pesoActual:Double
        pesoActual = peso /(Math.pow(altura, 2.0))
        if (pesoActual >= 20 && pesoActual <= 25)
            pesoDevuelto = debajoPesoIdeal
        else
        {
            if (pesoActual < 20)
                pesoDevuelto = pesoIdeal
             else
            {
                pesoDevuelto = sobrePeso
            }
        }
        return pesoDevuelto
    }
    //Calcula si es mayor de edad o no
    fun esMayorDeEdad(): Boolean {
        var mayor: Boolean = false
        if (edad >= 18){
            mayor = true
        }
        return mayor
    }
    //Comprueba el sexo del individuo
    fun comprobarSexo(): Boolean{
        var sex: Boolean = false
        if (sexo == 'M')
            sex = true
        return sex
    }
    //Genera la DNI
    fun generaDNI(): String {
        var Dni = ""
        val LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" // 0 ... 25
        val num = "0123456789"
        for (i in 0..7)
        {
            Dni+= num[Random.nextInt(0, 10)]
        }
        Dni+= LETRAS[Random.nextInt(0, 26)]
        dni = Dni
        return dni
    }

    //Sobrescribe los datos
    override fun toString(): String {
        return ("Nombre: $nombre"+"\nEdad: $edad"+"\nDNI: $dni"+"\nsexo: $sexo"+"\npeso: $peso"+"\nAltura: $altura")
    }
}