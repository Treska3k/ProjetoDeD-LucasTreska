package org.example

class Anao(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Fortes e destemidos, os anões são mestres em batalhas e forjas!"

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("forca", 2)
        ficha.adicionarBonus("constituicao", 2)
    }
}
