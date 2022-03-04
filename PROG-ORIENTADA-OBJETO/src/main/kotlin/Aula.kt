fun main() {

    /*
Declarar os atributos e métodos - abrir arquivo class
Atributos - variaveis que nós declaramos dentro uma classe
*/

   /* val Personagem1 = Pessoa()

    Personagem1.nome = "Naruto"
    Personagem1.altura = 1.86
    Personagem1.peso = 78.0
    Personagem1.corDosOlhos = "Azul"
    Personagem1.tomDePele = "Branco"
    Personagem1.corDoCabelo = "Amarelo"
    Personagem1.força = 340.0


    println("Nome - ${Personagem1.nome}")
    println("Altura -${Personagem1.altura}")
    println("Peso - ${Personagem1.peso}")
    println("Cor dos Olhos - ${Personagem1.corDosOlhos}")
    println("Tom de Pele ${Personagem1.tomDePele}")
    println("Cor do cabelo  ${Personagem1.corDoCabelo}")
    println("Forçã ${Personagem1.força}")

    */

   /* val conta = ContaBanco ()

    conta.titular = "Daiane"
    conta.tipo = 1
    conta.saldo = 3000.0

    */

//Chamer os metodos da ContaBanco

   /* conta.mostrarSaldo()

    println ("Digite o valor de saque:")
    val saque = readLine()!!.toDouble()

    conta.saque(saque)

    println ("Digite o valor de depósito:")
    val deposito = readLine()!!.toDouble()

    conta.deposito(deposito)

    conta.mostrarSaldo()

    */

    val pessoa = Pessoa("Daiane",1.65,95.0,"Castanho",
        "Preta","Castanho")
    println(pessoa)
}

