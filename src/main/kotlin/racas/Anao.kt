package org.example.racas

import Personagem

class Anao : Raca {
    val proficienciaConstituicao = 2

    override fun aplicarProficiencias(personagem: Personagem): Personagem {
        personagem.constituicao += proficienciaConstituicao

        return personagem
    }
}
