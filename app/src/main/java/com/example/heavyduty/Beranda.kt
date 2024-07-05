import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.heavyduty.R
import com.example.heavyduty.card_adapter1
import com.example.heavyduty.card_adapter2
import com.example.heavyduty.card_adapter4
import com.example.ukl3.card_adapter3


class Beranda: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)


        val  rc1=  view.findViewById<RecyclerView>(R.id.rv1)
        val rc2=view.findViewById<RecyclerView>(R.id.rv2)
        val rc3=view.findViewById<RecyclerView>(R.id.rv3)
        val rc4=view.findViewById<RecyclerView>(R.id.rv4)

        val listFoto = listOf<Int>(
            R.drawable.ft1,
            R.drawable.ft1,
            R.drawable.ft1
        )
        val listTv = listOf<String>(
            "Home Maintance",
            "BUild and Renovate",
            "Desaign Inspiration"
        )

        val listFoto2 = listOf<Int>(
            R.drawable.ft3,
            R.drawable.ft4,
            R.drawable.ft5,
            R.drawable.ft6
        )

        val  listFoto3= listOf<Int>(
            R.drawable.ft8,
            R.drawable.ft9,
            R.drawable.ft10,
            R.drawable.ft11
        )

        val listtgl4= listOf<String>(
            "5 Oct 2021",
            "28 Aprl 2020",
            "20 Maret2022"
        )
        val listfoto4= listOf<Int>(
            R.drawable.ft12,
            R.drawable.ft13,
            R.drawable.ft14
        )
        val listtext4tbl= listOf<String>(
            "Aplikasi tukang.com jasa......",
            "Benerin Dulu,Bayarnya...",
            "Event , Bersama"
        )
        val listtext4tps= listOf<String>(
            "Keramiknya mungkin.....",
            "Kira - kira kamu tertarik.....",
            "Tanaman Manfaat"
        )


        val mainAdapter = card_adapter1(listFoto,listTv)
        val mainAdapter2 = card_adapter2(listFoto2)
        val mainAdapter3= card_adapter3(listFoto3)
        val mainAdapter4= card_adapter4(listtgl4, listfoto4, listtext4tbl, listtext4tps)

        rc1.adapter = mainAdapter
        rc2.adapter=mainAdapter2
        rc3.adapter=mainAdapter3
        rc4.adapter=mainAdapter4





        return  view
    }

}