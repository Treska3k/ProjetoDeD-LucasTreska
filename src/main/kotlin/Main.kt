package org.example

fun main() {
    println("\nBem-vindo ao campo de batalha, aventureiro!\n " +
            "Prepare-se para forjar seu destino em um mundo de desafios e" +
            " glórias.\n Escolha sua raça, defina seus atributos e prove sua força." +
            " Sua jornada épica começa agora—mostre do que você é feito!\n")

    println("Insira o nome do seu guerreiro: ")
    val nomePersonagem = readLine() ?: "."
    println("Nome escolhido: $nomePersonagem")

    println("Agora escolha a raça:")
    println("1. Humano: Versátil e implacável, o humano domina qualquer desafio com coragem e força indomáveis!")
    println("2. Elfo: Ágil e mortal, o elfo combina magia poderosa e precisão letal para derrotar seus inimigos!")
    println("3. Anão: Pequeno no tamanho, mas brutal na força. O anão esmaga inimigos e ergue fortalezas com sua tenacidade implacável!")
    println("4. Halfling: Pequeno, mas mortal. O halfling usa sua rapidez e audácia para atacar com precisão letal e desespero implacável!")
    println("5. Gnomo: Pequeno e temível, o gnomo usa inteligência afiada e magia traiçoeira para derrubar inimigos com precisão.")
    println("6. Dragonato:Imponente e destruidor, o dragonato combina força dracônica e fúria devastadora para esmagar qualquer oponente!")
    println("7. Meio-Elfo: Ágil e enigmático, o meio-elfo usa sua combinação de astúcia e poder mágico para dominar e aterrorizar seus inimigos!")
    println("8. Meio-Orc: Brutal e implacável, o meio-orc usa sua força monstruosa e fúria feroz para esmagar tudo em seu caminho!")
    println("9. Tiefling: Sombrio e enigmático, o tiefling conjura magia infernal com uma intensidade aterradora, deixando um rastro de destruição.")
    val escolhaRaca = readLine()?.toIntOrNull() ?: 1

    val raca: Raca = when (escolhaRaca) {
        1 -> Humano(nomePersonagem)
        2 -> Elfo(nomePersonagem)
        3 -> Anao(nomePersonagem)
        4 -> Halfling(nomePersonagem)
        5 -> Gnomo(nomePersonagem)
        6 -> Dragonato(nomePersonagem)
        7 -> MeioElfo(nomePersonagem)
        8 -> MeioOrc(nomePersonagem)
        9 -> Tiefling(nomePersonagem)
        else -> Humano(nomePersonagem)
    }

    println(raca.informacoes())

    val ficha = Ficha()
    println("Distribua seus pontos (cada atributo começa em 8 e o máximo é 15):")

    val atributos = listOf("forca", "destreza", "inteligencia", "sabedoria", "carisma", "constituicao")
    for (atributo in atributos) {
        var pontosValidados = false
        while (!pontosValidados) {
            ficha.mostrarFichaComNumeros()
            println("Digite quantos pontos deseja adicionar em $atributo (máximo é 15):")
            val pontos = readLine()?.toIntOrNull() ?: 0
            val valorAtual = ficha.getValorAtributo(atributo)
            if (pontos > 0 && ficha.pontosRestantes >= pontos && valorAtual + pontos <= 15) {
                ficha.distribuirPontos(atributo, pontos)
                pontosValidados = true
            } else if (valorAtual + pontos > 15) {
                println("Não é possível aumentar $atributo além de 15. Tente novamente.")
            } else {
                println("Pontos inválidos ou insuficientes. Tente novamente.")
            }
        }
    }

    raca.aplicarBonus(ficha)

    println("Os bônus da raça foram aplicados à sua ficha.")

    println("Ficha final do personagem:")
    ficha.mostrarFicha()

    println("\nSua jornada chega ao fim, $nomePersonagem.\n " +
            "O destino foi selado e seu personagem está pronto para enfrentar o que o mundo tem a oferecer.\n" +
            " Boa sorte em suas aventuras que a coragem e a força te guiem na batalha! ")
}
