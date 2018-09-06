package com.example.jiadibo.footballclubfirstsubmission

import android.graphics.Typeface
import android.view.Gravity
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

class DescriptionClubUI(val img: Int, val name: String, val desc: String) : AnkoComponent<DescriptionActivity>{

    override fun createView(ui: AnkoContext<DescriptionActivity>) = with(ui) {
        verticalLayout {
            lparams(matchParent, wrapContent)

            imageView{
                Glide.with(this.context)
                        .load(img)
                        .into(this)

            }.lparams(width = dip(100),height = dip(100)){
                gravity = Gravity.CENTER_HORIZONTAL
                topMargin = dip(60)
            }
            textView{
                text =  name
                textSize = 24f
                setTypeface(Typeface.DEFAULT_BOLD)
            }.lparams(wrapContent, wrapContent){
                gravity = Gravity.CENTER
                topMargin = dip(5)
            }
            textView{
                text =  desc
                textSize = 18f
            }.lparams(width = matchParent, height = wrapContent){
                topMargin = dip(10)
                leftMargin = dip(8)
                rightMargin = dip(8)
            }


        }
    }
}