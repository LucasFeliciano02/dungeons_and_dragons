package racas

import Personagem
import org.example.racas.Raca

class Halfling : Raca {
    val proficienciaDestreza = 2

    override fun aplicarProficiencias(personagem: Personagem): Personagem {
        personagem.destreza += proficienciaDestreza

        return personagem
    }
}