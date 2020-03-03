package model

class Cuenta(titular: String, cantidad: Double) {
    //Atributos
    private var titular: String = ""
    private var cantidad = 0.0

    //Constructores
    fun Cuenta(titular: String) {
        this.titular
    }
    fun Cuenta(titular: String, cantidad: Double) {
        this.titular
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0.0
        } else {
            this.cantidad = cantidad
        }
    }

    fun getTitular(): String {
        return titular
    }
    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getCantidad(): Double {
        return cantidad
    }
    fun setCantidad(cantidad: Double) {
        this.cantidad = cantidad
    }

    //Metodos especiales
    //Ingresa dinero en la cuenta, solo si es positivo la cantidad
    fun ingresar(cantidad: Double) {
        if (cantidad > 0) {
            this.cantidad += cantidad
        }
    }

    //Retira una cantidad en la cuenta, si se quedara en negativo se quedaria en cero

    fun retirar(cantidad: Double) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0.0
        } else {
            this.cantidad -= cantidad
        }
    }

    //Devuelve el estado del objeto
    override fun toString(): String {
        return "El titular $titular tiene $cantidad  en la cuenta"
    }

}
