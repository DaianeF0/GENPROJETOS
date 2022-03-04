    //Cadastro de Cliente - Salão de Beleza
    class Cliente constructor(var nomeCompleto: String,var Rua: String,var Num:Int,
                               var Bairro: String, var Cidade: String, var Estado: String,
                               var Pais: String,var Cep:Int, var Tel:Int ) {

        var Instragam = ""
        var Email = ""
        var Total = 0.0

        constructor(
            nomeCompleto: String, Rua: String, Num: Int,
            Bairro: String, Cidade: String, Estado: String,
            Pais: String, Cep: Int, Tel: Int, Instragam: String, Email: String
        ) :
                this(
                    nomeCompleto, Rua, Num,
                    Bairro, Cidade, Estado,
                    Pais, Cep, Tel
                ) {

            this.Instragam = Instragam
            this.Email = Email
        }

        override fun toString(): String {
            return "\n Nome - $nomeCompleto" +
                    "\n Rua - $Rua" +
                    "\n Num - $Num" +
                    "\n Bairro - $Bairro" +
                    "\n Cidade - $Cidade" +
                    "\n Estado - $Estado" +
                    "\n Pais - $Pais" +
                    "\n Cep - $Cep" +
                    "\n Tel - $Tel" +
                    "\n Instragam - $Instragam" +
                    "\n Email- $Email"
        }


        fun corte(x: Double){
            val x = 50.0
            println ("O corte é no valor de R$$x")
        }
        fun Escova(x: Double) {
            val x= 60.0
            println ("A escova é no valor de R$$x")
        }
        fun Luzes(x: Double) {
            val x= 250.0
            println ("A Luzes é no valor de R$$x")
        }
        fun Progressiva(x: Double) {
            val x= 350.0
            println ("A progressiva é no valor de R$$x")
        }

        fun total (x: Double){
            Total = x+50+60+250+350
            println ("Se solicitar todos os serviços o valor total cobrado é R$$Total")

        }

    }




