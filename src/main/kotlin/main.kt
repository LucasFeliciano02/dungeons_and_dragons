import org.example.racas.* // Importa todas as classes de raças
import racas.*

fun main() {
    var personagem: Personagem

    // Exibição das opções de raça disponíveis para o usuário
    do {
        println("╔══════════════════════════════════╗")
        println("║   Escolha a Raça do Personagem   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Anão                          ║")
        println("║ 2. Draconato                     ║")
        println("║ 3. Elfo                          ║")
        println("║ 4. Halfling                      ║")
        println("║ 5. Humano                        ║")
        println("║ 6. Gnomo                         ║")
        println("║ 7. Meio-Elfo                     ║")
        println("║ 8. Meio-Orc                      ║")
        println("║ 9. Tiefling                      ║")
        println("╚══════════════════════════════════╝")
        print("Digite o número correspondente à raça desejada: ")

        val escolha = readln().toIntOrNull() ?: -1  // Lê a escolha do usuário e trata entradas inválidas

        // Associa a escolha do usuário à criação do personagem com a raça correspondente
        personagem = when (escolha) {
            1 -> Personagem(Anao())
            2 -> Personagem(Draconato())
            3 -> Personagem(Elfo())
            4 -> Personagem(Halfling())
            5 -> Personagem(Humano())
            6 -> Personagem(Gnomo())
            7 -> Personagem(MeioElfo())
            8 -> Personagem(MeioOrc())
            9 -> Personagem(Tiefling())
            else -> {
                println("⚠️  Opção inválida, tente novamente.")
                continue
            }
        }
        break // Sai do loop se a opção foi válida

    } while (true)

    // Define os atributos iniciais do personagem
    personagem.definirAtributos()

    // Aplica as proficiências raciais específicas ao personagem chamado
    personagem = personagem.raca.aplicarProficiencias(personagem)

    // Define e aplica o bônus de vida
    personagem.vida = 10
    personagem.definirVida()

    // Exibe os atributos finais do personagem
    personagem.mostrarAtributos()
}
