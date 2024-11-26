package org.example.racas

import com.example.myapplicationdg.jogo.personagens.Personagem
import java.io.Serializable

// Todas as raças terão sua própria implementação e devem ser capaz de aplicar suas proficiências a um personagem
interface Raca: Serializable {
    // metodo recebe um objeto Personagem e retorna um Personagem modificado após a aplicação das proficiências raciais
    fun aplicarProficiencias(personagem: Personagem): Personagem
}
