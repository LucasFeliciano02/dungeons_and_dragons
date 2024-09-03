import org.example.racas.Humano
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    var personagem = Personagem(Humano())

    @Test
    fun `testa se o valor inicial da vida do personagem e 10`(){
        assertEquals(10, personagem.vida)
    }
}