package org.example

class Elfo(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Conhecidos por sua graça, magia natural e longevidade."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("destreza", 2)
    }
}
