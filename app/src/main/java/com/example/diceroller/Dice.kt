package com.example.diceroller

class Dice() {
    fun randomSideofDice () : Int{
        var randomNumberRange: IntRange = 1..6
        return randomNumberRange.random()
    }
}