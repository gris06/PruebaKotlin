package mx.tecnm.voaxaca.pruebakotlin.InterfaceSegregation

import kotlin.math.pow


interface Figura {
    fun calcularArea(): Double
}

interface FiguraCircular{
    fun calcularRadio(): Double
}

data class Circulo (val diametro : Double): Figura, FiguraCircular {

    override fun calcularRadio(): Double = diametro / 2

    override fun calcularArea(): Double = Math.PI * calcularRadio().pow(2)
}

data class Cuadrado (val ancho: Double, val alto: Double) : Figura {

    override fun calcularArea(): Double = ancho * alto

}