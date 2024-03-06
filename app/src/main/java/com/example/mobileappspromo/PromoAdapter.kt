package com.example.mobileappspromo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.EventListener

class PromoAdapter (private val context: Context, private val promo: List<Promo>, val listener: (Promo) -> Unit)
    : RecyclerView.Adapter<PromoAdapter.PromoViewHolder>(){
    class PromoViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgPromo = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePromo = view.findViewById<TextView>(R.id.tv_item_name)
        val descPromo = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(promo: Promo, listener: (Promo) -> Unit){
            imgPromo.setImageResource(promo.imgPromo)
            namePromo.text = promo.namePromo
            descPromo.text = promo.namePromo
            itemView.setOnClickListener{
                listener(promo)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoViewHolder {
        return PromoViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_promo, parent, false)
        )
    }

    override fun getItemCount(): Int = promo.size

    override fun onBindViewHolder(holder: PromoViewHolder, position: Int) {
        holder.bindView(promo[position], listener)
    }

}
