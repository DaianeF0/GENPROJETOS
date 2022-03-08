package aulaHeranca

class Cachorro(nome: String, idade: Int):
    Animal (nome, idade){

    override fun emSom(){
        println("O som do (a) cachorro $nome é Au Au Au") }

    fun correr(){
        println("O (A) $nome está correndo animado (a)") }
    }
