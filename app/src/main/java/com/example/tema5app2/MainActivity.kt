package com.example.tema5app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema5app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener{

    private lateinit var tareaAdapter: TareaAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var itemDecoration: DividerItemDecoration


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tareaAdapter = TareaAdapter(TareaDatos.TAREAS, this)
        linearLayoutManager = LinearLayoutManager(this)
        itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)


        binding.recyclerId.apply {
            layoutManager = linearLayoutManager
            adapter = tareaAdapter
            addItemDecoration(itemDecoration)
        }
    }

    private fun getTareas():MutableList<Tarea>{
        val tareas = mutableListOf<Tarea>()

        val tarea1 =  Tarea("Correr 30 minutos", "08:00")
        val tarea2 = Tarea("Estudiar móviles", "10:00")
        val tarea3 = Tarea("Comer 4 rebanadas de manzana", "10:30")
        val tarea4 =  Tarea("Asistir al taller de programación", "15:45")

        tareas.add(tarea1)
        tareas.add(tarea2)
        tareas.add(tarea3)
        tareas.add(tarea4)

        return tareas
    }

    override fun onClick(tarea: Tarea) {
        Toast.makeText(this, tarea.getNombre(), Toast.LENGTH_SHORT).show()
    }
}