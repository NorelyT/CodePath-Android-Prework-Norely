package com.example.helloworldapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        // List that allows the program to iterate over the images
        val imageList = arrayOf<ImageView>(findViewById(R.id.axolotl),
            findViewById(R.id.prairieDog), findViewById(R.id.snek))

        
        // Whenever the button is pressed, it shows the next image after the currently
        // displaying image and updates the text label, button text, and button colors
        // depending on the picture
        findViewById<Button>(R.id.changeAnimalButton).setOnClickListener(){
            val textViewRef = findViewById<TextView>(R.id.textView)
            val replyButtonRef = findViewById<Button>(R.id.replyButton)
            val changeAnimalButtonRef = findViewById<Button>(R.id.changeAnimalButton)
            if (imageList[0].alpha == 1F){
                imageList[0].alpha = 0F
                imageList[1].alpha = 1F
                textViewRef.text = "Hey! I'm Oafy and I definitely ate too much last winter."
                replyButtonRef.text = "Feed the oaf!"
                replyButtonRef.setTextColor(getColor(R.color.cream_gray))
                replyButtonRef.setBackgroundColor(getColor(R.color.ash_gray))

                changeAnimalButtonRef.setTextColor(getColor(R.color.cream_gray))
                changeAnimalButtonRef.setBackgroundColor(getColor(R.color.ash_gray))
            }
            else if (imageList[1].alpha == 1F){
                imageList[1].alpha = 0F
                imageList[2].alpha = 1F
                textViewRef.text = "Hewo, I'm Snek and I'm always ready for a hooman boop!"
                replyButtonRef.text = "Boop the snoot!"
                replyButtonRef.setTextColor(getColor(R.color.yellow_white))
                replyButtonRef.setBackgroundColor(getColor(R.color.dirt_brown))

                changeAnimalButtonRef.setTextColor(getColor(R.color.yellow_white))
                changeAnimalButtonRef.setBackgroundColor(getColor(R.color.dirt_brown))
            }
            else {
                imageList[2].alpha = 0F
                imageList[0].alpha = 1F
                textViewRef.text = "Hi I'm Davide, I know I look dumb but I'm also cute!"
                replyButtonRef.text = "Say hello!"
                replyButtonRef.setTextColor(getColor(R.color.light_pink))
                replyButtonRef.setBackgroundColor(getColor(R.color.deep_pink))

                changeAnimalButtonRef.setTextColor(getColor(R.color.light_pink))
                changeAnimalButtonRef.setBackgroundColor(getColor(R.color.deep_pink))
            }
        }

        
        // Displays a unique Toast message for each image
        findViewById<Button>(R.id.replyButton).setOnClickListener(){
            var displayString = ""
            if (imageList[0].alpha == 1F) {
                displayString = "Hello to you too!"
            }
            else if (imageList[1].alpha == 1F) {
                displayString = "OM-NOM-NOM"
            }
            else {
                displayString = "Boop has successfully landed!"
            }
            Toast.makeText(this, displayString, Toast.LENGTH_SHORT).show()
        }
    }
}
