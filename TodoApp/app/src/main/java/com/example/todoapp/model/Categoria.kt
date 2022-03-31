package com.example.todoapp.model

class Categoria (

    val id : Long,
    var descricao : String?,
    var tarefas : List<Tarefa>?
) {

    override fun toString(): String {
        return descricao!!
    }
}