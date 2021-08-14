package mx.tecnm.voaxaca.pruebakotlin.Liskov

open class Rectangulo(var x : Int, var y : Int)  {

    open fun cambiarX (x: Int){

        this.x = x
    }

    open fun cambiarY(y: Int){
        this.y = y
    }

}

class Cuadrado(x: Int, y: Int) : Rectangulo(x, y) {

    override fun cambiarX(x: Int) {
        this.x = x
        this.y = x
    }

    override fun cambiarY(y: Int) {
        this.x = y
        this.y = y
    }
}