package mx.tecnm.voaxaca.pruebakotlin.Liskov.Preconditions

open class Jugador {

    open fun subirDeNivel (puntos: Int){
        if (puntos < 0 || puntos > 100)
            throw IllegalArgumentException("Los puntos deben ser positivos y menores de 100")
    }
}

class JugadorChetado : Jugador () {

    override fun subirDeNivel(puntos: Int) {

        // No hay problema, debelitar una precondicion
        if (puntos < 0 || puntos > 150)
            throw IllegalArgumentException("Puntos deberian ser positivos y menores que 150")
    }
}

class Jugadorlegal : Jugador (){

    override fun subirDeNivel(puntos: Int) {

        // Viola el LSP, el fortalecer una precondicion ...
        if (puntos <  0 || puntos > 70)
            throw IllegalStateException("Puntos deben ser positivos y menores que 70")
    }
}

class JugadorExtra : Jugador (){
    override fun subirDeNivel(puntos: Int) {
        if (puntos < -4 || puntos > 110)
            throw IllegalArgumentException("Puntos debe ser negativos y menores de 110")
    }
}

class JugadorExtra2 : Jugador(){
    override fun subirDeNivel(puntos: Int) {
        // Rompe el LSP
        if (puntos > 5 || puntos < 200)
            throw IllegalArgumentException("Puntos debe ser positvo y menor que 200")
    }
}