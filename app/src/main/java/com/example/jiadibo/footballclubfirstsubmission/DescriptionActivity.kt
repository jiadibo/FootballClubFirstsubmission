package com.example.jiadibo.footballclubfirstsubmission

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class DescriptionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val posisi = intent.getIntExtra("id", 0)
        val image = resources.obtainTypedArray(R.array.club_image).getResourceId(posisi, 0)
        val name = resources.getStringArray(R.array.club_name).getOrElse(posisi, { "" })
        val desc = resources.getStringArray(R.array.club_desc).getOrElse(posisi, { "" })

        DescriptionClubUI(image, name, desc).setContentView(this)

    }

}