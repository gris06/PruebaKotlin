package mx.tecnm.voaxaca.pruebakotlin.OpenClose

class BebidaEnergetica: SubidorEnergia(){

    override val energiaBase = 15


    private val enbenenada = true

    override fun consumir(saludInicial: Int): Int {

        var saludTemportal = saludInicial + energiaBase

        if (enbenenada){
            saludTemportal = 5
        }

        return saludTemportal
    }

}