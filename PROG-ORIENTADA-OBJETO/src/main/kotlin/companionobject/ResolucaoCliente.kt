package companionobject

class ResolucaoCliente constructor(private var nome: String) {

    private var endereco = ""
    private var telefone = ""
    private var listadeCompra = mutableListOf<String>()

    constructor(
        nome: String, endereco: String,
    ) :
            this(
                nome
            ) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(
        nome, endereco
    ) {
        this.telefone = telefone
    }

    init {
        if (nome.isEmpty()){
            throw Exception("Classe instanciada de maneira incorreta!")
        }else{
            println("Classe instanciada com sucesso!")
        }
    }
    fun cadProduto(valor: String) {
        if (valor.isEmpty()) {
            println("Produto inválido")
        } else {
            listadeCompra.add(valor)
            println("Produto $valor adicionado com sucesso")
        }
    }

    fun remproduto(valor: String) {

        if (valor.isEmpty()) {
            println("Produto inválido")
        } else if (listadeCompra.contains(valor)) {
            listadeCompra.remove(valor)
            println("Produto $valor removido com sucesso")
        } else {
            println("Esse produto $valor não exite na lista")
        }
    }

    fun listasItem() {

        println("***Compras clinte: $nome ***")
        listadeCompra.forEach {
            println(it)
        }
    }
}