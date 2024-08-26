import org.example.racas.Anao
import org.example.racas.Humano
import racas.*

fun main() {
    var personagem = Personagem(Anao())  // Inicializa personagem com a raça Anao por padrão

    var racaEscolhida = ""  // armazenará a escolha da raça do usuário

    do {
        println("Insira a raça do personagem:")
        racaEscolhida = readln()

        if (racaEscolhida == "Anao") {
            personagem = Personagem(Anao())  // cria um personagem da raça escolhida
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

    // Define os atributos iniciais do personagem
    personagem.definirAtributos()

    // Aplica as proficiências raciais específicas ao personagem chamado
    personagem = personagem.raca.aplicarProficiencias(personagem)

    personagem.vida = 10  // Define a vida inicial do personagem
    personagem.definirVida()

    // Exibe os atributos finais do personagem
    personagem.mostrarAtributos()
}
