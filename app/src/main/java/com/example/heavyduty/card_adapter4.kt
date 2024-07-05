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

class card_adapter4(
    val listtgl4:List<String>,
    val listfoto4: List<Int>,
    val listtext4tbl:List<String>,
    val listtext4tps:List<String>
): RecyclerView.Adapter<card_adapter4.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  card_adapter4.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_card_adapter4,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listtgl4.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Text1.text = listtgl4[position]
        holder.foto.setImageResource(listfoto4[position])
        holder.Text2.text=listtext4tbl[position]
        holder.Text3.text=listtext4tps[position]
    }

    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val Text1=view.findViewById<TextView>(R.id.tv8)
        val  foto = view.findViewById<ImageView>(R.id.img4)
        val Text2=view.findViewById<TextView>(R.id.tv9)
        val Text3=view.findViewById<TextView>(R.id.tv10)
    }
}