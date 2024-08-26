package org.example

class Tiefling(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Conhecidos por sua herança infernal e habilidades mágicas."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("carisma", 2)
        ficha.adicionarBonus("inteligencia", 1)
    }
}
