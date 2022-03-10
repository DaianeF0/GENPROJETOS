package testeunit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {


    val cliente= Cliente("Daiane",)
    @Test
    fun cadProduto() {

        assertEquals(1,cliente.totalItens())
    }

    @Test
    fun remproduto() {
    }
}