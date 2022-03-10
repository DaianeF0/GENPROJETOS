//fun main (){
// Interagir com usuario

/*var nome = ""
var idade = 0
var altura = 0.0


print("Digite o seu nome: ")
nome = readLine()!!

println("Digite o sua idade")
idade = readLine()!!.toInt()

println("Digite o sua altura")
altura = readLine()!!.toDouble()

println("Olá, meu nome é $nome, tenho $idade de anos e $altura de altura")

 */

// Compras de 50 para cima - 10%
// Compras de 100 para cima - 30%
// Compras de 200 para cima - 50%

/* print ("Digite o valor da sua compra: ")
 val compra = readLine()!!.toDouble()

 var porc = 0.0

 if(compra <50) {
     porc = 0.0
 } else if (compra>= 50 && compra < 100){
         porc = 0.1

     }else if (compra>= 100 && compra < 200){
         porc = 0.3

     }else{
         porc = 0.5
     }

     val desc = compra * porc

     println(" Com sua compra, você terá um desconto de ${porc*100}% resultado em R$$desc")

 */

/* print ("Digite um valor da 1 até 4: ")
 val num = readLine()!!.toInt()

 when (num){
     1 -> println ("Verão")
     2 -> println ("Outono")
     3 -> println ("Inverno")
     4 -> println ("Primavera")
     else -> println ("Valor incorreto")

 */


/* print ("Digite um mês para verificamos em qual estação do ano ele se encontra: ")
 val mes = readLine()!!.toInt()

// 12 até 3 = Verão
// 4 até 6 = Outono
// 7 até 9 = Inverno
// 10 até 12 = Primavera

 when (mes){
     in 1 .. 3 -> println ("Verão")
     in 4 .. 6 -> println ("Outono")
     in 7 .. 9 -> println ("Inverno")
     in 10 .. 12 -> println ("Primavera")

     else  -> println ("Mes invalido")

 */

 //24.02 - Exemplo de while

 /*var soma = 0
 var num = 5

 while (num != 0){

  print ("Digite um número difente de 0 :")
  num = readLine()!!.toInt()

  soma += num

 }

 println ("A soma de todos os números digitados é $soma")

  */

 //Exemplo do ... while

 /*do {
  print ("Tem o Pete e o Repete, o Pete morreu quem sobrou?")
  val resp = readLine()!!

 } while (resp == "Repete" || resp == "repete")

  */

//Exemplo for


/* print ("Digite um valor para calculamos a sua tabuada: ")
 val tab = readLine()!!.toInt()

 for (i in 1..10){

  println ("$tab * $i = ${tab * i}")
 }
 */



//Exemplo for com step


 /*print ("Digite um valor para calculamos a sua tabuada: ")
 val tab = readLine()!!.toInt()

 for (i in 1..10 step 2){

  println ("$tab * $i = ${tab * i}")
 }

  */

 // exemplo do for com break = tem erro corrigir
 /* var passo = 2

  for (i in 1 ..20 step passo) {

   println("$i")

   if (i == 9) {
    passo = 3
    for (i in 10..20 step passo) {
     println("$i")
    }
   }
   break
   }

  */
/* print ("Digite o seu nome para retorna em letras maiscula: ")
 val nome = readLine ()!!

 println (" O seu nome em letra maiscula é : ${letrasMaiusculas(nome)}")

 */
/* ARRAY */

// val num = arrayOf(" Daiane","Eudes")
 //println(num)

 //val num2 = arrayOfNulls<String>(5)

//Iterando valors de maneira mais simples
/*for (in 0..2){
 println(num)
}
 */
//Iterando valors de maneira mais correta
/*for (i in num){
 println(i)}

// For each
num.forEach{
 println(it)*/

 //while (true)

  /* print ("Adicione um nome de carro na lista: ")
  val carro = readLine ()!!

  if (carro.isEmpty()){
   break}
  else { nome.add(carro)
  }}
 println (carro)


 print ("Remova um nome  de carro na lista: ")
 val carros = readLine ()!!

 nome.remove(carro)



  */


