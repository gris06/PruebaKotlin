package mx.tecnm.voaxaca.pruebakotlin.OpenClose

class KitMedico: SubidorEnergia(){

    override val energiaBase = 40


    val proterina = 4
    val hierro = 6

    override fun consumir(saludInicial: Int) =
        saludInicial + energiaBase * hierro * proterina


}
