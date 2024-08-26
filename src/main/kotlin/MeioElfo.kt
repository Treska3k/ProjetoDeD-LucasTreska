package org.example

class MeioElfo(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Combinando a adaptabilidade dos humanos com a graça dos elfos."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("carisma", 2)
    }
}
