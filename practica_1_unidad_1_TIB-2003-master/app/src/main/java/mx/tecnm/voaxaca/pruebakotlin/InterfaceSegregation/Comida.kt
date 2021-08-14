package mx.tecnm.voaxaca.pruebakotlin.InterfaceSegregation



enum class TIPO {
    COMIDA_RAPIDA, POSTRE, COMIDA_MEXICANA, COMIDA_CHINA, ENSALADA
}


interface Comida {
    fun nombre (): String

    fun tipo (): TIPO
}

interface ComidaFria : Comida {
    fun congelar(): String
}

interface ComidaCaliente : Comida {
    fun cocer(): String
}

class Helado : Comida, ComidaFria  {

    companion object  {
        const val NOMBRE_COMIDA = "VAINILLA"
    }

    override fun nombre(): String {
        return NOMBRE_COMIDA
    }

    override fun tipo(): TIPO {
        return TIPO.POSTRE
    }

    override fun congelar(): String {
        return "Congelando ..."
    }

}

class Caldo : Comida, ComidaCaliente {

    override fun nombre(): String {
        return "Caldo de pollo"
    }

    override fun tipo(): TIPO {
        return TIPO.COMIDA_MEXICANA
    }

    override fun cocer(): String {
        return "Cocinando ..."
    }

}

class Ensalada : Comida {

    override fun nombre(): String {
        return "Ensalada de lechuga ..."
    }

    override fun tipo(): TIPO {
        return TIPO.ENSALADA
    }

}