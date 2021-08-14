package mx.tecnm.voaxaca.pruebakotlin.Liskov.HistoryConstrant

open class Jugador {

    // Si este se vuelve true , siempre debe mantenerse true ...
    var estaMuerto = false


    //..

    open fun subirVida (){

    }
}

class Jugadorchetado : Jugador() {

    fun revivir (){
        // Rompemos la regla de restriccion de historia ..
        estaMuerto = false
    }

    override fun subirVida() {
        revivir()
    }
}