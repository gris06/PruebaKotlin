package mx.tecnm.voaxaca.pruebakotlin

class Empleado {
    // Atributos
    val name = "KEVIN DAVID MOLINA GOMEZ"
    val age = 24

}

class GuardadorDatosEmpleado {

    fun guardar (empleado: Empleado){
        // logica para guardar en base de datos.
    }
}

class ReportadorHorasTrabajo {

    fun reportarHorasPara(empleado: Empleado){
        // logica para consultar info checador, cuantas horas falto.
    }
}


class CalculadoraPagos {

    fun calcularPagoPara(empleado: Empleado){

        // Logica que calcula el pago HT * SB
    }
}



