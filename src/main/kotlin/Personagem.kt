import org.example.racas.Raca

class Personagem(var raca: Raca) {
    var nome: String = ""

    var forca: Int = 0
    var destreza: Int = 0
    var constituicao: Int = 0
    var inteligencia: Int = 0
    var sabedoria: Int = 0
    var carisma: Int = 0

    var vida: Int = 10

    // Função para atribuir atributos com controle de pontos
    private fun definirAtributo(nomeAtributo: String): Int {
        // Mapeamento de custo de pontos para cada valor de atributo (8 a 15)
        val custoPontos = mapOf(15 to 9, 14 to 7, 13 to 5, 12 to 4, 11 to 3, 10 to 2, 9 to 1, 8 to 0)
        var controller: Int // Variável para controlar o loop de validação
        var totalDePontos = 27 // Pontos totais disponíveis para distribuição entre os atributos
        var valorAtributo: Int // Valor do atributo escolhido pelo usuário

        // Loop para pedir ao usuário um valor válido para o atributo
        do {
            print("Digite um valor entre 8 e 15 para $nomeAtributo: ")
            valorAtributo = readln().toInt() // Lê o valor digitado pelo usuário e converte para inteiro
            val custo = custoPontos[valorAtributo] ?: -1 // Busca o custo dos pontos; se o valor for inválido, retorna -1

            // Verifica se o valor é válido e se há pontos suficientes para gastar
            if (custo == -1 || totalDePontos - custo < 0) {
                println("Valor incorreto ou pontos insuficientes. Pontos atuais: $totalDePontos")
                controller = 1 // Mantém o loop ativo, pois a entrada foi inválida
            } else {
                totalDePontos -= custo // Subtrai o custo dos pontos totais
                controller = 0 // Sai do loop, pois a entrada foi válida
            }
        } while (controller != 0) // Repete o loop até que o usuário insira um valor válido

        return valorAtributo // Retorna o valor do atributo definido
    }

    // Função para definir todos os atributos do personagem.
    fun definirAtributos() {
        // Chama a função definirAtributo para cada um dos atributos, permitindo ao usuário definir seus valores
        forca = definirAtributo("força")
        destreza = definirAtributo("destreza")
        constituicao = definirAtributo("constituição")
        inteligencia = definirAtributo("inteligência")
        sabedoria = definirAtributo("sabedoria")
        carisma = definirAtributo("carisma")
    }

    // Função para definir o bônus de vida com base na constituição do personagem
    fun definirVida() {
        // Lista que define o bônus de vida com base na constituição, variando de -4 a +10
        val bonusVida = listOf(
            -4, -4, -4, // Para constituição de 1 a 3
            -3, -3, // Para constituição de 4 a 5
            -2, -2, // Para constituição de 6 a 7
            -1, -1, // Para constituição de 8 a 9
            0, 0,   // Para constituição de 10 a 11
            1, 1,   // Para constituição de 12 a 13
            2, 2,   // Para constituição de 14 a 15
            3, 3,   // Para constituição de 16 a 17
            4, 4,   // Para constituição de 18 a 19
            5, 5,   // Para constituição de 20 a 21
            6, 6,   // Para constituição de 22 a 23
            7, 7,   // Para constituição de 24 a 25
            8, 8,   // Para constituição de 26 a 27
            9, 9,   // Para constituição de 28 a 29
            10      // Para constituição de 30
        )
        // Ajusta a vida do personagem de acordo com o bônus, garantindo que o índice esteja entre 1 e 30
        vida += bonusVida[constituicao.coerceIn(1, 30) - 1]
    }

    fun mostrarAtributos() {
        println("\nVida: $vida")
        println("Força: $forca")
        println("Destreza: $destreza")
        println("Constituição: $constituicao")
        println("Inteligência: $inteligencia")
        println("Sabedoria: $sabedoria")
        println("Carisma: $carisma")
        println("=================================")
    }
}
