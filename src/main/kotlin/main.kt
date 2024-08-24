import org.example.racas.Anao
import org.example.racas.Humano
import racas.*

fun main() {
    var personagem = Personagem(Anao())


    var racaEscolhida = ""

    do {
        println("Insira a raça do personagem:")
        racaEscolhida = readln()
        if (racaEscolhida == "Anao") {
            personagem = Personagem(Anao())
        } else if (racaEscolhida == "Draconato") {
            personagem = Personagem(Draconato())
        } else if (racaEscolhida == "Elfo") {
            personagem = Personagem(Elfo())
        } else if (racaEscolhida == "Halfling") {
            personagem = Personagem(Halfling())
        } else if (racaEscolhida == "Humano") {
            personagem = Personagem(Humano())
        } else if (racaEscolhida == "Gnomo") {
            personagem = Personagem(Gnomo())
        } else if (racaEscolhida == "MeioElfo") {
            personagem = Personagem(MeioElfo())
        } else if (racaEscolhida == "MeioOrc") {
            personagem = Personagem(MeioOrc())
        } else if (racaEscolhida == "Tiefling") {
            personagem = Personagem(Tiefling())
        } else {
            racaEscolhida = "Não definido"
            println("Opção inválida")
        }
    } while (racaEscolhida == "Não definido")

    personagem.definirAtributos()
    personagem = personagem.raca.aplicarProficiencias(personagem)
    personagem.vida = 10
    personagem.definirVida()
    personagem.mostrarAtributos()
}
