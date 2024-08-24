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

    fun definirAtributos() {
        var totalDePontos = 27
        var controller: Int = 0
        do {
            print("Digite um valor entre 8 e 15 para força: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    controller = 0
                }

                14 -> {
                    totalDePontos -= 7
                    controller = 0
                }

                13 -> {
                    totalDePontos -= 5
                    controller = 0
                }

                12 -> {
                    totalDePontos -= 4
                    controller = 0
                }

                11 -> {
                    totalDePontos -= 3
                    controller = 0
                }

                10 -> {
                    totalDePontos -= 2
                    controller = 0
                }

                9 -> {
                    totalDePontos -= 1
                    controller = 0
                }

                8 -> {
                    totalDePontos -= 0
                    controller = 0
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            forca = number
        } while (controller != 0)
        do {
            print("Digite um valor entre 8 e 15 para destreza: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    controller = 0
                }

                14 -> {
                    totalDePontos -= 7
                    controller = 0
                }

                13 -> {
                    totalDePontos -= 5
                    controller = 0
                }

                12 -> {
                    totalDePontos -= 4
                    controller = 0
                }

                11 -> {
                    totalDePontos -= 3
                    controller = 0
                }

                10 -> {
                    totalDePontos -= 2
                    controller = 0
                }

                9 -> {
                    totalDePontos -= 1
                    controller = 0
                }

                8 -> {
                    totalDePontos -= 0
                    controller = 0
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            destreza = number
        } while (controller != 0)
        do {
            print("Digite um valor entre 8 e 15 para constituicao: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    controller = 0
                }

                14 -> {
                    totalDePontos -= 7
                    controller = 0
                }

                13 -> {
                    totalDePontos -= 5
                    controller = 0
                }

                12 -> {
                    totalDePontos -= 4
                    controller = 0
                }

                11 -> {
                    totalDePontos -= 3
                    controller = 0
                }

                10 -> {
                    totalDePontos -= 2
                    controller = 0
                }

                9 -> {
                    totalDePontos -= 1
                    controller = 0
                }

                8 -> {
                    totalDePontos -= 0
                    controller = 0
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            constituicao = number
        } while (controller != 0)
        do {
            print("Digite um valor entre 8 e 15 para inteligencia: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 9
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                14 -> {
                    totalDePontos -= 7
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 7
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                13 -> {
                    totalDePontos -= 5
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 5
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                12 -> {
                    totalDePontos -= 4
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 4
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                11 -> {
                    totalDePontos -= 3
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 3
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                10 -> {
                    totalDePontos -= 2
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 2
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                9 -> {
                    totalDePontos -= 1
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 1
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                8 -> {
                    totalDePontos -= 0
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 0
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            inteligencia = number
        } while (controller != 0)
        do {
            print("Digite um valor entre 8 e 15 para sabedoria: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 9
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                14 -> {
                    totalDePontos -= 7
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 7
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                13 -> {
                    totalDePontos -= 5
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 5
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                12 -> {
                    totalDePontos -= 4
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 4
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                11 -> {
                    totalDePontos -= 3
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 3
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                10 -> {
                    totalDePontos -= 2
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 2
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                9 -> {
                    totalDePontos -= 1
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 1
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                8 -> {
                    totalDePontos -= 0
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 0
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            sabedoria = number
        } while (controller != 0)
        do {
            print("Digite um valor entre 8 e 15 para carisma: ")
            var number = readln().toInt()
            when (number) {
                15 -> {
                    totalDePontos -= 9
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 9
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                14 -> {
                    totalDePontos -= 7
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 7
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                13 -> {
                    totalDePontos -= 5
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 5
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                12 -> {
                    totalDePontos -= 4
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 4
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                11 -> {
                    totalDePontos -= 3
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 3
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                10 -> {
                    totalDePontos -= 2
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 2
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                9 -> {
                    totalDePontos -= 1
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 1
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                8 -> {
                    totalDePontos -= 0
                    if (totalDePontos < 0) {
                        println("Pontos Insuficiente \nPontos Atuais: $totalDePontos")
                        totalDePontos += 0
                        controller = 1
                    } else {
                        controller = 0
                    }
                }

                else -> {
                    println("Valor incorreto")
                    controller = 1
                }
            }
            carisma = number
        } while (controller != 0)
    }

    fun definirVida() {
        when(constituicao) {
            1 -> vida -= 4
            2 -> vida -= 4
            3 -> vida -= 4
            4 -> vida -= 3
            5 -> vida -= 3
            6 -> vida -= 2
            7 -> vida -= 2
            8 -> vida -= 1
            9 -> vida -= 1
            10 -> vida = 0
            11 -> vida = 0
            12 -> vida += 1
            13 -> vida += 1
            14 -> vida += 2
            15 -> vida += 2
            16 -> vida += 3
            17 -> vida += 3
            18 -> vida += 4
            19 -> vida += 4
            20 -> vida += 5
            21 -> vida += 5
            22 -> vida += 6
            23 -> vida += 6
            24 -> vida += 7
            25 -> vida += 7
            26 -> vida += 8
            27 -> vida += 8
            28 -> vida += 9
            29 -> vida += 9
            30 -> vida += 10
        }
    }

    fun mostrarAtributos() {
        println("Vida: " + vida)

        println("Força: " + forca)
        println("Destreza: " + destreza)
        println("Constituição: " + constituicao)
        println("Inteligência: " + inteligencia)
        println("Sabedoria: " + sabedoria)
        println("Carisma: " + carisma)

        println("=================================")
    }
}


