package racas

import Personagem
import org.example.racas.Raca

class Gnomo : Raca {
    val proficienciaInteligencia = 2

    override fun aplicarProficiencias(personagem: Personagem): Personagem {
        personagem.inteligencia += proficienciaInteligencia

        return personagem
    }
}