package mx.tecnm.voaxaca.pruebakotlin.OpenClose

class Jugador {

    var salud: Int = 100


    fun conseguirEnergia(subidorEnergia: SubidorEnergia){

        salud = subidorEnergia.consumir(salud)

    }

}