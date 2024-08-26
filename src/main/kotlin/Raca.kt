package org.example

abstract class Raca(val nome: String) {
    abstract fun informacoes(): String
    abstract fun aplicarBonus(ficha: Ficha)
}
