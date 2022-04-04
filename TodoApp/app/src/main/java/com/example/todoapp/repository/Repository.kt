package com.example.todoapp.repository

import com.example.todoapp.api.RetrofitInstance
import com.example.todoapp.model.Categoria
import com.example.todoapp.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria () : Response<List<Categoria>> {
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa (tarefa: Tarefa) : Response<Tarefa> {
        return RetrofitInstance.api.addTarefa(tarefa)
    }

    suspend fun listTarefas () : Response<List<Tarefa>> {
        return RetrofitInstance.api.listTarefas()
    }

    suspend fun updateTarefa (tarefa: Tarefa) : Response<Tarefa> {
        return RetrofitInstance.api.updateTarefa(tarefa)}


}