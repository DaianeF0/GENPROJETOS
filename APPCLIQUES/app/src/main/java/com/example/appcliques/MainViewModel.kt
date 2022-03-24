package com.example.appcliques

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel () {

    val resClique = MutableLiveData<Int>()
    var cont = 0

fun cont(): Int {
    cont ++
    return cont
}
init {
    resClique.value = 0
}
    // resolução
    // val contador = MutableLiveData<Int>(0)

}