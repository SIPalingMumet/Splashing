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

class card_adapter5(
    val listfoto5: List<Int>,
    val listtextatas5:List<String>,
    val listtgl5:List<String>,
    val listtextbr5:List<String>,
    val listtextkng5:List<String>
): RecyclerView.Adapter<card_adapter5.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  card_adapter5.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_card_adapter5,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listtextatas5.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.foto.setImageResource(listfoto5[position])
        holder.Text1.text = listtextatas5[position]
        holder.Text2.text=listtgl5[position]
        holder.Text3.text=listtextbr5[position]
        holder.Text4.text=listtextkng5[position]
    }

    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val Text1=view.findViewById<TextView>(R.id.tv13)
        val  foto = view.findViewById<ImageView>(R.id.profile_image1)
        val Text2=view.findViewById<TextView>(R.id.tv14)
        val Text3=view.findViewById<TextView>(R.id.tv15)
        val Text4=view.findViewById<TextView>(R.id.tv16)
    }
}