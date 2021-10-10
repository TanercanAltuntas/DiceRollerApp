package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strtButton : Button = findViewById(R.id.startButtonDice)
        var toast1 : TextView = findViewById(R.id.toastMessage)
        var clickCounter = 0
        var firstImg : ImageView = findViewById(R.id.dicepng)
        firstImg.setImageResource(R.drawable.dice_0)
        var dice1Area: ImageView = findViewById(R.id.diceOne)
        var dice2Area: ImageView = findViewById(R.id.diceTwo)
        dice1Area.setImageResource(R.drawable.dice_0)
        dice2Area.setImageResource(R.drawable.dice_0)
        dice1Area.isVisible=false
        dice2Area.isVisible=false
        strtButton.setOnClickListener {
            dice1Area.isVisible=false
            dice2Area.isVisible=false
            firstImg.isVisible=true
            clickCounter++
            oneDice()
            toast1.text = "Dice rolled ${clickCounter} times"
        }
        var switchDice: Switch = findViewById(R.id.changeDiceNumber)
        var toast2: TextView = findViewById(R.id.toastMessage)
        switchDice.setOnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked){
            var counter1: Int=0
            strtButton.setOnClickListener {
                counter1++
                firstImg.isVisible=false
                dice1Area.isVisible=true
                dice2Area.isVisible=true
                twoDice()
                toast2.text = "Dice one rolled ${counter1} Dice two rolled ${counter1} times."
            }
        }
            else{
            var counter2: Int=0
            strtButton.setOnClickListener{
                counter2++
                oneDice()
                firstImg.isVisible=true
                dice1Area.isVisible=false
                dice2Area.isVisible=false
                toast2.text = "Dice rolled ${counter2} times."
            }
        }


        }
    }
    private fun oneDice() {
        var dice = Dice()
        var diceRoll = dice.randomSideofDice()
        var textAreaForDiceNumber : TextView = findViewById(R.id.txtWhichNumber)
        var diceImg : ImageView = findViewById(R.id.dicepng)

        var str: String = diceRoll.toString()
        textAreaForDiceNumber.text = "Dice: ${str}"

        if(diceRoll==1){
            diceImg.setImageResource(R.drawable.dice_1)
        }
        else if(diceRoll==2){
            diceImg.setImageResource(R.drawable.dice_2)
        }
        else if(diceRoll==3){
            diceImg.setImageResource(R.drawable.dice_3)
        }
        else if(diceRoll==4){
            diceImg.setImageResource(R.drawable.dice_4)
        }
        else if(diceRoll==5){
            diceImg.setImageResource(R.drawable.dice_5)
        }
        else{
            diceImg.setImageResource(R.drawable.dice_6)
        }

    }

    private fun twoDice(){
        var dice1 = Dice()
        var dice2 = Dice()
        var diceroll1 = dice1.randomSideofDice()
        var diceroll2 = dice2.randomSideofDice()
        var dice1Image: ImageView = findViewById(R.id.diceOne)
        var dice2Image: ImageView = findViewById(R.id.diceTwo)
        var textAreaForDiceNumber : TextView = findViewById(R.id.txtWhichNumber)
        var str: String = diceroll1.toString()
        var str2: String = diceroll2.toString()
        textAreaForDiceNumber.text = "Dice one:${str} Dice two:${str2}"

        if (diceroll1==1){
            dice1Image.setImageResource(R.drawable.dice_1)
        }
       else if (diceroll1==2){
            dice1Image.setImageResource(R.drawable.dice_2)
        }
       else if (diceroll1==3){
            dice1Image.setImageResource(R.drawable.dice_3)
        }
       else if (diceroll1==4){
            dice1Image.setImageResource(R.drawable.dice_4)
        }
       else if (diceroll1==5){
            dice1Image.setImageResource(R.drawable.dice_5)
        }
       else if (diceroll1==6){
            dice1Image.setImageResource(R.drawable.dice_6)
        }


        if (diceroll2==1){
            dice2Image.setImageResource(R.drawable.dice_1)
        }
        else if (diceroll2==2){
            dice2Image.setImageResource(R.drawable.dice_2)
        }
        else if (diceroll2==3){
            dice2Image.setImageResource(R.drawable.dice_3)
        }
        else if (diceroll2==4){
            dice2Image.setImageResource(R.drawable.dice_4)
        }
        else if (diceroll2==5){
            dice2Image.setImageResource(R.drawable.dice_5)
        }
        else if (diceroll2==6){
            dice2Image.setImageResource(R.drawable.dice_6)
        }



    }

}