package com.example.kotlin_app1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.changeNum)

        button1.setOnClickListener(){
            changetext()
        }


    }

    private fun changetext() {
        val t1 = findViewById<TextView>(R.id.t1)
        val diceImg=findViewById<ImageView>(R.id.diceImg)
        var randomNum :Int= Random.nextInt(6)+1

        if(randomNum == 1){
            diceImg.setImageResource(R.drawable.one)
        }else if(randomNum == 2){
            diceImg.setImageResource(R.drawable.two)
        }else if(randomNum == 3){
            diceImg.setImageResource(R.drawable.three)
        }else if(randomNum == 4){
            diceImg.setImageResource(R.drawable.four)
        }else if(randomNum == 5){
            diceImg.setImageResource(R.drawable.five)
        }else if(randomNum == 6){
            diceImg.setImageResource(R.drawable.six)
        }

        t1.text = randomNum.toString()


    }
}