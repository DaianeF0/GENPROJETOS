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

        1 -> "Adição e o resulatdo =  ${adicao(num1,num2)}"
        2 -> "Subtração e o resulatdo = ${subtração(num1,num2)}"
        3 -> "Multiplicação e o resulatdo =  ${multiplicação(num1,num2)} "
        4 -> "Divisão e o resulatdo = ${divisão(num1,num2)}"
        else -> "Operação inválida"
    }
    println("A operação escolhida foi: $opcao")





}
// com retorno
fun adicao (x:Double, y: Double):Double{
    val cal = x + y
    return cal
}
fun subtração (x:Double, y: Double):Double{
    val cal = x - y
    return cal
}
fun multiplicação (x:Double, y: Double):Double{
    val cal = x * y
    return cal

}
fun divisão (x:Double, y: Double):Double{
    val cal = x / y
    return cal

}

// sem retorno
fun adicaos (x: Double, y: Double){
    println(x+y)
}
fun subtraçãos (x:Double, y: Double){
    println(x-y)

}
fun multiplicaçãos (x:Double, y: Double){
    println(x*y)

}
fun divisãos (x:Double, y: Double){
    println(x/y)
}