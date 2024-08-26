package org.example

class MeioOrc(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Conhecidos por sua força bruta e tenacidade."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("forca", 2)
        ficha.adicionarBonus("constituicao", 1)
    }
}
