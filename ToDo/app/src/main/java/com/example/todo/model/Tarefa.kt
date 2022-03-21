package com.example.todo.model

data class Tarefa (

    var tarefa: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: String)

{
}