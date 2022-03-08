package aulaHeranca

class Preguiça(nome: String, idade: Int):
    Animal (nome, idade){

    override fun emSom(){
        println("O som do (a) $nome é zzzzzz") }

    fun escala(){
        println("O (A) preguiça  $nome está escalando na árvore lentamente)")
    }

    }