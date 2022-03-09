import testeunit.Calculadora

fun main () {

    /* Fazer uma calculadora utilizando funções para cada operação matemática:

        1 - Adição
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
*/
    println("***Calculadora***\n")
    print ("Digite o 1° número:  ")
    val num1 = readLine ()!!.toDouble()

    print ("Digite o 2° número:  ")
    val num2 = readLine ()!!.toDouble()
    var operacao: Int

    do{
        println("Digite a operação matematica que deseja realizar, " +
                "considerando 1 -Adição, 2 -Subtração, 3 -Multiplicação, 4 -Divisão")
        operacao = readLine()!!.toInt()

        if(!(operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4)){
            println("Operação inválida")
        }

    }while (!(operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4))

    val opcao = when (operacao){

        1 -> "Adição e o resulatdo =  ${Calculadora.adicao(num1,num2)}"
        2 -> "Subtração e o resulatdo = ${Calculadora.subtracao(num1,num2)}"
        3 -> "Multiplicação e o resulatdo =  ${Calculadora.multiplicacao(num1,num2)} "
        4 -> "Divisão e o resulatdo = ${Calculadora.divisao(num1,num2)}"
        else -> "Operação inválida"
    }
    println("A operação escolhida foi: $opcao")



}
