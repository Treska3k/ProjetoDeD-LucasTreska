package org.example

class Gnomo(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Conhecidos por sua inteligência e afinidade com a magia."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("inteligencia", 2)
        ficha.adicionarBonus("constituicao", 1)
    }
}
