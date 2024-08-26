package org.example

class Ficha {
    private val atributos = mutableMapOf(
        "forca" to 8,
        "destreza" to 8,
        "inteligencia" to 8,
        "sabedoria" to 8,
        "carisma" to 8,
        "constituicao" to 8
    )
    var pontosRestantes: Int = 27

    fun distribuirPontos(atributo: String, pontos: Int) {
        if (pontosRestantes >= pontos) {
            val novoValor = (atributos[atributo] ?: 8) + pontos
            if (novoValor <= 15) {
                atributos[atributo] = novoValor
                pontosRestantes -= pontos
                println("Você distribuiu $pontos pontos em $atributo. Pontos restantes: $pontosRestantes.")
            } else {
                println("Não é possível aumentar $atributo além de 15.")
            }
        } else {
            println("Pontos insuficientes. Você tem $pontosRestantes pontos restantes.")
        }
    }

    fun mostrarFicha() {
        println("Ficha do personagem:")
        atributos.forEach { (atributo, valor) ->
            println("$atributo: $valor")
        }
        println("Pontos Restantes: $pontosRestantes")
    }

    fun mostrarFichaComNumeros() {
        println("Ficha do personagem (atributos atuais):")
        var index = 1
        for ((atributo, valor) in atributos) {
            println("$index. $atributo: $valor")
            index++
        }
        println("Pontos Restantes: $pontosRestantes")
    }

    fun getValorAtributo(atributo: String): Int {
        return atributos[atributo] ?: 8
    }

    fun adicionarBonus(atributo: String, bonus: Int) {
        val novoValor = (atributos[atributo] ?: 8) + bonus
        atributos[atributo] = novoValor.coerceAtMost(15)
    }
}
