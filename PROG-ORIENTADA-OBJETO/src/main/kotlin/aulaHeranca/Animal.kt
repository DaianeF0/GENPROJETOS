package aulaHeranca

open class Animal (val nome: String,var idade: Int) {

    override fun toString(): String {
        return "\nNome - $nome" +
                "\nidade - $idade"}

    open fun emSom() {}
}

