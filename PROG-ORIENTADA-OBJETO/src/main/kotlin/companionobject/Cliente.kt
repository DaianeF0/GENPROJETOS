package companionobject   //Cadastro de Cliente

    data class Cliente constructor(private var nome: String) {

        private var endereco = ""
        private var telefone = ""
        private var listadeCompra = mutableListOf<String>()

        constructor(
            nome: String, endereco: String,telefone:String ) :
                this(
                    nome
                ) {
            this.endereco = endereco
            this.telefone = telefone
        }
        constructor(nome: String, endereco: String, telefone: String,
            listadeCompra:MutableList<String>): this(
            nome, endereco, telefone)
        {
            this.listadeCompra =listadeCompra
        }
       init {
           if (nome.isEmpty()){
               throw Exception("Classe instanciada de maneira incorreta!")
           }else{
               println("Classe instanciada com sucesso!")
           }
       }

        fun cadProduto(produto: String,quant:Int) {
            if (produto.isEmpty()) {
                println("Produto inválido")
            } else {
                listadeCompra.add(produto)
                println("Produto $produto adicionado com sucesso")
            }
        }
        fun remproduto(produto: String) {

            if (produto.isEmpty()) {
                println("Produto inválido")
            } else if (listadeCompra.contains(produto)) {
                listadeCompra.remove(produto)
                println("Produto $produto removido com sucesso")
            } else {
                println("Esse produto $produto não exite na lista")
            }
        }
        fun listasItem() {
            println("***Compra do clinte: $nome ***")
            listadeCompra.forEach {
                println(it)
            }
        }
    }