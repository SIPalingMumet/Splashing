import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.heavyduty.R
import com.example.heavyduty.card_adapter5

class Pesanan : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view=inflater.inflate(R.layout.fragment_pesanan, container, false)

        val  rc5= view.findViewById<RecyclerView>(R.id.rv5)

        val listfoto5= listOf<Int>(
            R.drawable.jokowi,
            R.drawable.ft15,
            R.drawable.jokowi
        )
        val listtextatas5= listOf<String>(
            "Jokowi",
            "Danis ",
            "Jokowi 2 Periode"
        )
        val listtgl5= listOf<String>(
            "21/04/2023 06:29",
            "26/04/2023 07:00",
            "31/04/2023 06:25"
        )
        val listtextbr5= listOf<String>(
            "Tukang Kilat",
            "Danis Las",
            "Ahli Ledeng"
        )
        val listtextkng5= listOf<String>(
            "Segera di konfirmasi",
            "Akan Menunungu konfirmasi",
            "Menunggu konfirmasi"
        )




        val mainAdapter5=
            card_adapter5(listfoto5, listtextatas5, listtgl5, listtextbr5, listtextkng5)
        rc5.adapter=mainAdapter5



        return view
    }}