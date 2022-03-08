package aulaHeranca

class Cavalo(nome: String, idade: Int):
    Animal (nome, idade){

    override fun emSom(){
        println("O som do (a) $nome é iiirrrrí, rilinchin") }

    fun correr(){
        println("O cavalo $nome está correndo feito louco(a)")
    }
}