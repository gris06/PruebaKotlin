package mx.tecnm.voaxaca.pruebakotlin.OpenClose


class Monster: SubidorEnergia(){
    override val energiaBase = 300

    override fun consumir(saludInicial: Int) =
        saludInicial + energiaBase * 1000

}
