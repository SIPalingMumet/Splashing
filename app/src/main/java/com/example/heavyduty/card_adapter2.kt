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
import com.example.heavyduty.R

class card_adapter2 (
    val listfoto2: List<Int>
): RecyclerView.Adapter<card_adapter2.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  card_adapter2.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_card_adapter2,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listfoto2.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.foto.setImageResource(listfoto2[position])
    }

    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val  foto = view.findViewById<ImageView>(R.id.img2)
    }
}