package org.example

class Dragonato(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Descendentes de dragões, conhecidos por sua força e habilidades dracônicas."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("forca", 2)
        ficha.adicionarBonus("constituicao", 1)
    }
}
