package mx.tecnm.voaxaca.pruebakotlin.Liskov


interface Crud :  CGet, CAdd, CUpdate, CDelete{

}

interface CGet{
    fun Get()    // Obtener - Read
}

interface CAdd {
    fun Add() // Crear - Create
}

interface CUpdate {
    fun Update() // Actualizar - Update
}

interface CDelete {
    fun Delete() // Borrar - Delete
}



class Usuario : Crud{

    override fun Add() {
        //  Logica ara agregar usuario al servidor
    }

    override fun Update() {
        // Logica para actualizar
    }

    override fun Delete() {
        // Logica para borrar
    }

    override fun Get() {
        // Logica para conseguir el usuario del servidor.
    }


}

class CambiarDireccion : CUpdate {

    override fun Update() {
       // Actualizar ...
    }

}

class Carrito : CAdd, CDelete {

    override fun Add() {
        // Logica agregar al crud
    }


    override fun Delete() {
       // Logica para borrar
    }

}
