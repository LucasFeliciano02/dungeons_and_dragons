package racas

import Personagem
import org.example.racas.Raca

class Tiefling : Raca {
    val proficienciaInteligencia = 1
    val proficienciaCarisma = 2


    override fun aplicarProficiencias(personagem: Personagem): Personagem {
        personagem.inteligencia += proficienciaInteligencia
        personagem.carisma += proficienciaCarisma

        return personagem
    }
}