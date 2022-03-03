fun main() {


    /*

    Array - uma variável que armazena mais de um valor e que tem um tamanho fixo

    val num = arrayOf("Henrique", "Rodrigo")

     */

    //Declaração de um array
    /*
    var num = arrayOf("Henrique", "Rodrigo")

    num = arrayOf("aklsjdlkas", "asdlkasjdklas", "aslkjdklasjlkd", "ajsdkas")

    val num2 = arrayOfNulls<String>(5)

    //Iterando valores de maneira mais simples
    /*
    for(i in 0..1){
        println(num[i])
    }
     */

    //Iterando da maneira mais correta
    /*
    for(i in num){
        println(i)
    }
     */

    //For Each
    num.forEach {
        println(it)
    }
     */

    /*

    List - Consegue armazenar vários valores (de tipos específicos) e tem um
    tamanho dinâmico

     */

    //Declaração utilizando listOf() - Nossa lista é imutável
    /*
    val nome = listOf("Henrique", "Rodrigo")

    println(nome)
     */

    //Declaração utilizando mutableListOf() - Nossa lista é mutável
    //Exemplo prático do uso de List


    /*val nome = mutableListOf<String>()

    //Exemplo utilizando o método add()

   /* nome.add("Henrique")
    nome.add("Rodrigo")
    nome.add("Rogério")
     */


    //Exemplo prático utilizando o add()
    while (true){

        print("Adicione um nome na lista: ")
        val nomeUsu = readLine()!!

        if(nomeUsu.isEmpty()){
            break
        }else{
            nome.add(nomeUsu)
        }
    }


    //Exemplo do método remove()


    //remove sem verificações
    //nome.remove(nomeUsu)


    while (true){

        print("\nRemova algum nome que você adicionou dentro da lista: ")
        val nomeUsu = readLine()!!

        //Remove utilizando o contains()
        if(nome.contains(nomeUsu)){
            nome.remove(nomeUsu)
            println("Usuário $nomeUsu removido com sucusso!")
            break
        }else{
            println("O nome $nomeUsu não existe na lista")
        }
    }

    println(nome)
     */

    /*
    set - Armazenar valores únicos, ou seja, valores que não se repetem

    setOf() - set imutável
    mutableSetOf() - set mutável

     */

    //Exemplo utilizando setOf()
    /*
    val set = setOf("Henrique", "Henrique")

    println(set)

    println(set.size)
     */

    //Exemplo prático utilizando o set

    /*
    val num = mutableSetOf(9)

    num.add(5)
    num.add(2)
    num.add(3)
    num.add(3)
    num.add(3)
    num.add(3)
    num.add(3)
    num.add(3)

    println(num)

    println(num)
     */


    /*

    map ou dicionário - Chave Valor (O map recebe um par de valores, onde um será
    a chave e o outro será o valor em si)

    Pair<K, V>

    mapOf - map imutável

    mutableMapOf - map mutável

     */

    //Declaração map imutável
    /*
    val mapUsuarios = mapOf(
        1 to "Henrique",
        5 to "Janilson",
        46 to "Zubumafu"
    )

    //Iterando sobre os valores de um map

    /*
    for (i in mapUsuarios){

        println(i.value)

    }
     */

    mapUsuarios.forEach{
        println(it.value)
    }
     */

    //Declaração map mutável

    /*val mapUsuarios = mutableMapOf<Int, String>()

    mapUsuarios[1] = "Henrique"
    mapUsuarios[3] = "Rogério"
    mapUsuarios[4] = "Clemilson"
    mapUsuarios[80] = "Jorge"
    mapUsuarios[10] = "Jorge"

    println(mapUsuarios)

    mapUsuarios[80] = "Genivaldo"

    println(mapUsuarios)

    mapUsuarios.remove(10)

    mapUsuarios[2]

     */

}