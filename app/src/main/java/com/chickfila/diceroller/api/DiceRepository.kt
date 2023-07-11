package com.chickfila.diceroller.api

import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.URL

class DiceRepository {

    fun rollDice() : Int {
        var diceNumber = 5
        Thread {
            val request = Request.Builder()
                .url(url)
                .get()
                .build()

            val response = client.newCall(request).execute()
            val responseBody = response.body!!.toString()
            diceNumber = responseBody.toInt()
            println("Dice Number = $diceNumber")
        }.start()
        return diceNumber
    }

    companion object {
        val client = OkHttpClient()
        val url = URL("https://www.random.org/integers/?num=1&min=1&max=6&col=1&base=10&format=plain&rnd=new")
    }
}