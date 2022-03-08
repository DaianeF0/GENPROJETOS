package aulaHeranca
fun main () {

    /*
        Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
        (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que
        tudo o que for comum a todos os animais fique na classe Animal:

        Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque
        o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.

      */

    val animal = Cachorro("Lessie", 3)
    println("$animal")
    animal.emSom()
    animal.correr()

    val animal1 = Cavalo("Rocinante", 6)
    println("$animal1")
    animal1.emSom()
    animal1.correr()

    val animal2 = Preguiça("Dominhoca", 2)
    println("$animal2")
    animal2.emSom()
    animal2.escala()

}



