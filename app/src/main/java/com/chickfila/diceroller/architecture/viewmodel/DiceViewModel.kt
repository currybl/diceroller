package com.chickfila.diceroller.architecture.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chickfila.diceroller.R
import com.chickfila.diceroller.api.DiceRepository
import com.chickfila.diceroller.architecture.model.Dice

class DiceViewModel : ViewModel() {

    var diceRepository = DiceRepository()
    var mDiceResult: MutableLiveData<Int> = MutableLiveData()
    var imageRes: MutableLiveData<Int> = MutableLiveData()

    fun rollDice() {
        val diceValue = diceRepository.rollDice()
        imageRes.value = diceToDraw(Dice(diceValue))
        mDiceResult.value = diceValue
    }

    private fun diceToDraw(dice: Dice): Int {
        return when(dice.diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_0
        }
    }

}