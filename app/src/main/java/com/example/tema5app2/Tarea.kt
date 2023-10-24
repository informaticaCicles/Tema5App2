package com.example.tema5app2

class Tarea(private var nombre: String, private var hora: String) {
    // Getter para obtener el nombre
    fun getNombre(): String {
        return nombre
    }

    // Setter para establecer el nombre
    fun setNombre(nuevoNombre: String) {
        nombre = nuevoNombre
    }

    // Getter para obtener la hora
    fun getHora(): String {
        return hora
    }

    // Setter para establecer la hora
    fun setHora(nuevaHora: String) {
        hora = nuevaHora
    }

}

class TareaDatos {

    companion object {
        val TAREAS = arrayListOf(
            Tarea("Correr 30 minutos", "08:00"),
            Tarea("Estudiar móviles", "10:00"),
            Tarea("Comer 4 rebanadas de manzana", "10:30"),
            Tarea("Asistir al taller de programación", "15:45"),
            Tarea("Quedar con Belén", "18:00")
        )
    }
}