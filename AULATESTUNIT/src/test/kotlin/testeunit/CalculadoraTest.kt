package testeunit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
internal class CalculadoraTest {

@Test
  fun adicaoTest() {

      assertEquals(9.0,Calculadora.adicao(3.0,6.0))
  }

  @Test
  fun subtracaoTest() {
      assertEquals(9.0,Calculadora.subtracao(3.0,6.0))
  }

  @Test
  fun multiplicacaoTest() {

      assertEquals(9.0,Calculadora.multiplicacao(18.0,9.0))
  }

  @Test
  fun divisaoTest() {
      assertEquals(9.0,Calculadora.divisao(81.0,9.0))
  }


}