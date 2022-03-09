package testeunit

class Calculadora {
    companion object{

        fun adicao (x:Double, y: Double):Double{

            return x + y
        }
        fun subtracao (x:Double, y: Double):Double{
            val cal = x - y
            return cal
        }
        fun multiplicacao (x:Double, y: Double):Double{
            val cal = x * y
            return cal
        }
        fun divisao (x:Double, y: Double):Double{
            val cal = x / y
            return cal}
    }
}
