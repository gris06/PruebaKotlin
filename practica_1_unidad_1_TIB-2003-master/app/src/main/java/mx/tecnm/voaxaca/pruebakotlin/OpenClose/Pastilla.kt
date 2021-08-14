package mx.tecnm.voaxaca.pruebakotlin.OpenClose

class Pastilla: SubidorEnergia(){
    override val energiaBase = 50
    override fun consumir(saludInicial: Int) =
        saludInicial + energiaBase

}