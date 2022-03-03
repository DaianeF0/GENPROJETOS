fun main (){
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    val produto = mutableListOf<String>()

    while (true){
        print("Insira o nome do produto, para armazenar na lista de estoque, para encerrar clique no enter: ")
        val produto1 = readLine()!!

        if(produto1.isEmpty()){
            break
        }else{
            produto.addAll(listOf(produto1))
        }
    }
    while (true) {

        print("\nRemova algum produto que você adicionou dentro da lista: ")
        val produto1 = readLine()!!

        if (produto.contains(produto1)) {
            produto.remove(produto1)
            println("Produto $produto1 removido com sucusso!")
            break
        } else {
            println("O produto $produto1 não existe na lista, por favor informa algum dos seguintes " +
                    "itens $produto")
        }
    }
        println("OS produtos restante que consta na lista de estoque são: $produto")
}
