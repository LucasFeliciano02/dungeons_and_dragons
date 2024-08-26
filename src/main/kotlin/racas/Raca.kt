package org.example.racas

import Personagem

// Todas as raças terão sua própria implementação e devem ser capaz de aplicar suas proficiências a um personagem
interface Raca {
    // metodo recebe um objeto Personagem e retorna um Personagem modificado após a aplicação das proficiências raciais
    fun aplicarProficiencias(personagem: Personagem): Personagem
}
