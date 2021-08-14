package mx.tecnm.voaxaca.pruebakotlin.Liskov.PostConditions

open class Jugador {

    var salud = 100
    var estaMuerto = false

    open fun matarJugador(){
        salud = 0
        estaMuerto = true
    }




}

class NoquearJugador: Jugador (){

    var noqueado = false
    var equipo = 3

    override fun matarJugador() {

        if (salud <= 0 && equipo >= 1) {
            noqueado = true
        }
        else if (salud <= 0 && equipo == 0){
            // Salir de la partida ...
        }

    }

    fun revivir(){
        salud = 30
        estaMuerto = false
    }
}