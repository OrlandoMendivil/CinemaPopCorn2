package mendivil.orlando.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorSeries: BaseAdapter {
    lateinit var contexto: Context
    var listaSeries: ArrayList<Serie> = ArrayList()

    constructor(contexto: Context, listaSeries: ArrayList<Serie>){
        this.contexto = contexto
        this.listaSeries = listaSeries
    }

    override fun getCount(): Int {
        //Indica el número de objetos en la lista.
        return listaSeries.size
    }

    override fun getItem(p0: Int): Any {
        //Indica el elemento individual con el cual puedo interactuar
        return listaSeries[p0]
    }

    override fun getItemId(p0: Int): Long {
        //Pide el ID del elemento que estamos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //Obtener un inflador
        val inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.serie_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.imgSeriesTest)
        var tv_name: TextView = vista.findViewById(R.id.tv_series_name)

        var serie: Serie = listaSeries[p0]

        iv_img.setImageResource(serie.img)
        tv_name.setText(serie.nombre)

        vista.setOnClickListener {
            val intent: Intent = Intent(contexto, Movie_description::class.java )
            intent.putExtra("Nombre", serie.nombre)
            intent.putExtra("Sinopsis", serie.sinopsis)
            intent.putExtra("Img", serie.img)
            contexto.startActivity(intent)

        }

        return vista



    }

}