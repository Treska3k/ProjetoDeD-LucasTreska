package org.example

class Halfling(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Conhecidos por sua agilidade e espírito aventureiro."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("destreza", 2)
        ficha.adicionarBonus("constituicao", 1)
    }
}
