package mx.tecnm.voaxaca.pruebakotlin.Liskov.ClassInvariants

open class Jugador {
    open var salud = 100
}

class JugadorChetado : Jugador(){


    fun rellevarVida(puntos: Int){
        salud += puntos // Si untos es mayor que 100, Se rompe el subtipo

    }

}