package testeunit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculadoraTest{

    @Test

    fun adicaoTest(){

        assertEquals(9.0,Calculadora.adicao(6.0,3.0))
    }

    @Test
    fun subtracaoTest(){

        assertEquals(9.0,Calculadora.subtracao(18.0,9.0))
    }

    @Test
    fun multiplicacaoTest(){

        assertEquals(9.0,Calculadora.multiplicacao(3.0,3.0))
    }

    @Test
    fun divisaoTest(){

        assertEquals(9.0,Calculadora.divisao(81.0,9.0))
    }
}