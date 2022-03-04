/*Conta de Banco
    Atributos - Titular, Tipo, Saldo
    Métodos - Saque, Depósito,  Saldo, TransfEnt,TransfSai, PixEnt,PIxSai
*/
// Declarar os atributos
 data class ContaBanco ( var Titular:String,var Tipo:Int /* 1- Conta corrente e 2 - Conta Poupança*/,
                    var saldo:Double) {

// Declarar os métodos

    fun mostrarSaldo(){
        println ("O saldo da sua conta é R$$saldo")
    }

    fun deposito (valor:Double){
        if (valor <=0){
            println ("Depósito impossivel de ser realizado")
        }else{
            saldo += valor
            println ("Depósito de R$$valor  realizado com sucesso")
        }
    }
    fun saque (valor:Double){
            if (saldo <=0){
                println ("Saldo insuficiente")
            }else if (valor <= 0){
                println ("Saque impossivel de ser realizado")
            }else if (valor > saldo){
                println ("Quantia solicitada maior que o saldo disponibilizado")
            }else{
                saldo -= valor
                println ("Saque de R$$valor realizado com sucesso")
            }
    }
    fun TransfEnt (valor:Double){
        if (valor <=0){
            println ("Transferencia impossivel de ser realizado")
        }else{
            saldo += valor
            println ("Transferencia de R$$valor  realizado com sucesso")
        }
    }
    fun TransfSai (valor:Double){
        if (saldo <=0){
            println ("Saldo insuficiente para realizar transferencia")
        }else if (valor <= 0){
            println ("Transferencia impossivel de ser realizado")
        }else if (valor > saldo){
            println ("Quantia solicitada maior que o saldo disponibilizado")
        }else{
            saldo -= valor
            println ("Transferencia de R$$valor realizado com sucesso")
        }
    }
    fun PixEnt (valor:Double){
        if (valor <=0){
            println ("Pix impossivel de ser realizado")
        }else{
            saldo += valor
            println ("Pix de R$$valor  realizado com sucesso")
        }
    }
    fun PIxSai (valor:Double){
        if (saldo <=0){
            println ("Saldo insuficiente para realizar Pix")
        }else if (valor <= 0){
            println ("Pix impossivel de ser realizado")
        }else if (valor > saldo){
            println ("Quantia solicitada maior que o saldo disponibilizado")
        }else{
            saldo -= valor
            println ("Pix de R$$valor realizado com sucesso")
        }
    }

}