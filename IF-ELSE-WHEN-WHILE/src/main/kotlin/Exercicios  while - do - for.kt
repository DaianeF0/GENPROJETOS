fun main (){

// Exercicios 24.02

    //1- Informar todos os números de 1000 a 1999 que quando divididos por 11
    //obtemos resto = 5. (FOR)

 /*   for (i in 1000..2000) {
    if (i % 11 == 5)
        println ("$i")
}
  */

    //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

  /*println("Será necessario inserir dez número, por favor digite:")
  val num = readLine()!!.toInt()
   */




    /*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
     */

   /* var idade = 0
    var TP21 = 0
    var TP50 = 0

    while (idade != -99 ){
        println("Inserir a idade, e para encerrar o programa digite -99: ")
        idade = readLine()!!.toInt()

        if (idade > 0 && idade < 21 ) {
            TP21 += 1
        }
        if (idade > 50 ){
                TP50 += 1
        }
    }
        println("O número de pessoas com idade menor de 21 é: $TP21 ")
        println("O número de pessoas com idade maior de 50 é: $TP50 ")
    */


 /*5- Crie um programa que leia um número do teclado até que encontre um número
        igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
         */
 /* var count= 0.0
    var soma = 0.0
    do {
        print("Informe um número, e para encerrar o programa digite 0: ")
        val num = readLine()!!.toDouble()
        if(num!=0.0){
            count+=1
            soma += num
        }
    }while(num > 0);
    print("A soma dos números digitados é: $soma")

  */

    /* 6- Escrever um programa que receba vários números inteiros no teclado. E no final
  imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE
    */

   /* var count= 0
    var soma = 0.0
    do {
        print("Informe um número, e para encerrar o programa digite 0: ")
        val num = readLine()!!.toInt()

        if(num % 3 == 0 && num != 0){
            count+=1
            soma += num
        }
    }while(num != 0);
    print("Dentre os numeros digitados, $count são divisiveis por 3 e a média desse numeros é")
    */
}