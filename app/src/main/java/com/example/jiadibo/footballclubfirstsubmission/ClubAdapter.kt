package com.example.jiadibo.footballclubfirstsubmission

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list_club.view.*

class ClubAdapter(val context: Context, val items: List<Model_Item>, private val listener:(Int) -> Unit)
    : RecyclerView.Adapter<ClubAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubAdapter.ViewHolder =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_club, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener, position)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        fun bindItem(items: Model_Item, listener:(Int) -> Unit, pos: Int){
            itemView.name.text = items.name
            Glide.with(itemView.context).load(items.image).into(itemView.image)
            itemView.setOnClickListener {
                listener(pos)
            }
        }
    }
}