package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.adapter.TarefaAdapter
import com.example.todo.model.Tarefa

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listTarefas = mutableListOf(

            Tarefa("Fazer o TCC",
                "Escrever o capitulo 1",
                "Daiane",
                "2022/03/22",
                false,
                "Estudo"),

            Tarefa("Almoço",
                "Fazer almoço",
                "Eudes",
                "2022/03/21",
                true,
                "Alimentação"),

            Tarefa("Limpar a Casa ",
                "Fazer faxina geral ",
                "Eudes e Daiane",
                "2022/03/26",
                false,
                "Casa"),

            )

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listTarefas)

        return view
    }

}