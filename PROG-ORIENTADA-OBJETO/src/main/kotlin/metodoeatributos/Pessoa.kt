package metodoeatributos

class Pessoa constructor(var nome: String, var altura: Double){

    var peso = 0.0
    var corDosOlhos = ""
    var tomDePele = ""
    var corDoCabelo = ""

        //Construtor Secundário
    constructor(nome: String, altura: Double, peso:Double,corDosOlhos:String):
            this(nome,altura){

                this.peso = peso
                this.corDosOlhos= corDosOlhos
            }

        //Construtor Terciário
    constructor(nome: String, altura: Double, peso:Double,corDosOlhos:String,tomDePele:String,
                corDoCabelo:String):

            this (nome,altura,peso,corDosOlhos){

            this.tomDePele= tomDePele
            this.corDoCabelo= corDoCabelo
            }

    override fun toString(): String {
        return  "\n Nome - $nome"+
                "\n Altura - $altura"+
                "\n Peso - $peso"+
                "\n Cor dos Olhos - $corDosOlhos"+
                "\n Tom de Pele - $tomDePele"+
                "\n Cor do Cabelo - $corDoCabelo"


    }
}
