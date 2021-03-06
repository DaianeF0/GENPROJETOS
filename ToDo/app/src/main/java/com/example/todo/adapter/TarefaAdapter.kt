package com.example.todo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    private var listTarefas = emptyList<Tarefa>()

    class TarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val textTarefa = view.findViewById<TextView> (R.id.textTarefa)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switchCardAtivo)
        val textCategoria = view.findViewById<TextView>(R.id.textCategoria)
        val buttonDeletar = view.findViewById<Button>(R.id.buttonDeletar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {

        val layout = LayoutInflater.from(parent.context).
        inflate(R.layout.card_layout_tarefa, parent, false)

        return TarefaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

        val tarefa = listTarefas [position]

        holder.textTarefa.text= tarefa.tarefa
        holder.textDescricao.text = tarefa.descricao
        holder.textResponsavel.text = tarefa.responsavel
        holder.textData.text = tarefa.data
        holder.switchCardAtivo.isChecked = tarefa.status
        holder.textCategoria.text = tarefa.categoria
    }

    override fun getItemCount(): Int {
       return listTarefas.size
    }

    fun setLista(lista: List<Tarefa>){
        listTarefas = lista
        notifyDataSetChanged()
    }


}
