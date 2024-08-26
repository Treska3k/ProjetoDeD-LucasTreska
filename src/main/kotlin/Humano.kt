package org.example

class Humano(nome: String) : Raca(nome) {
    override fun informacoes() = "$nome: Humanos são adaptáveis e versáteis."

    override fun aplicarBonus(ficha: Ficha) {
        ficha.adicionarBonus("forca", 1)
        ficha.adicionarBonus("destreza", 1)
        ficha.adicionarBonus("constituicao", 1)
        ficha.adicionarBonus("sabedoria", 1)
        ficha.adicionarBonus("carisma", 1)
    }

}
