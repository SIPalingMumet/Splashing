package com.example.heavyduty



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class card_adapter1 (
    val listfoto: List<Int>,
    val  listtext: List<String>
):RecyclerView.Adapter<card_adapter1.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): card_adapter1.ViewHolder {
        return  ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_card_adapter1,parent,false)

        )
    }

    override fun onBindViewHolder(holder: card_adapter1.ViewHolder, position: Int) {
        holder.foto.setImageResource(listfoto[position])
        holder.text.text = listtext[position]
    }

    override fun getItemCount(): Int {
        return  listtext.size
    }

    class  ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val  foto = view.findViewById<ImageView>(R.id.img1)
        val text = view.findViewById<TextView>(R.id.tv1)

    }    }