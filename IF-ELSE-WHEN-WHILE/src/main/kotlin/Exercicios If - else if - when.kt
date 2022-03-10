import kotlin.math.sqrt
fun main () {

// 23/02/22 - EXERCICIOS

    /*3 -Faça um programa que receba a idade de uma pessoa e
    mostre na saída em qual categoria ela se encontra:
    10-14 infantil
    15-17 juvenil
    18-25 adulto
     */

    /* println("Por favor digite sua idade:")
     val idade=readLine()!!.toInt()

     when (idade){
         in 10 .. 14 -> println ("Você se encontra na categoria infantil")
         in 15 .. 17 -> println ("Você se encontra na categoria juvenil")
         in 18 .. 25 -> println ("Você se encontra na categoria adulta")

         else  -> println ("Idade invalida para o programa")
     }*/

    //5- Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.

    /* println("Por favor digite o número do mês: ")
     val mes =readLine()!!.toInt()

      val nomedoMes = when (mes){

          1 -> "Janeiro"
          2 -> "Fevereiro"
          3 -> "Março"
          4 -> "Abril"
          5 -> "Maio"
          6 -> "Junho"
          7 -> "Julho"
          8 -> "Agosto"
          9 -> "Setembro"
          10 -> "Outubro"
          11 -> "Novembro"
          12 -> "Dezembro"

          else -> "Mês inválido"
      }
     println("O mês escolhifo foi: $nomedoMes")

     */
    // 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.

    /*  println("Será necessario inserir três número, por favor digite 1°: ")
    val num =readLine()!!.toInt()

    println(" Por favor digite 2°: ")
    val num1 =readLine()!!.toInt()

    println(" Por favor digite 3°: ")
    val num2 =readLine()!!.toInt()

    if (num > num1 && num > num2) {
        println("O maior número é: $num")

    }else if (num1 > num2 ) {
        println("O maior número é: $num1 ")
    }else
        println("O maior número é: $num2")

   */

    //4 - Faça um programa em que permita a entrada de um número qualquer
    //e exiba se este número é par ou ímpar.
    //Se for par exiba também a raiz quadrada do mesmo;
    //se for ímpar exiba o número elevado ao quadrado.

  /*  println("Por favor digite o número qualquer: ")
    val num = readLine()!!.toDouble()


    if (num % 2 == 0.0) {
        val raiz = sqrt(num)
        println("O nuémero $num é par e raiz quadrada é ${"%.2f".format(raiz)}")
    } else
    println("O nuémero $num é impar e a sua potencia quadrada é ${num*num}")

   */
}


