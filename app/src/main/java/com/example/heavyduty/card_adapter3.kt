package com.example.ukl3


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.heavyduty.R

class card_adapter3(
    val listfoto3: List<Int>
): RecyclerView.Adapter<card_adapter3.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  card_adapter3.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_card_adapter3,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listfoto3.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.foto.setImageResource(listfoto3[position])
    }

    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val  foto = view.findViewById<ImageView>(R.id.img3)
    }
}