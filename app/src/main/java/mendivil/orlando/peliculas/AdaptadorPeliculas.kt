package mendivil.orlando.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPeliculas: BaseAdapter{
    lateinit var contexto: Context
    var listaPeliculas: ArrayList<Pelicula> = ArrayList()

    constructor(contexto: Context, listaPeliculas: ArrayList<Pelicula>){
        this.contexto = contexto
        this.listaPeliculas = listaPeliculas
    }

    override fun getCount(): Int {
        //Indica el número de objetos en la lista.
        return listaPeliculas.size
    }

    override fun getItem(p0: Int): Any {
        //Indica el elemento individual con el cual puedo interactuar
        return listaPeliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
       //Pide el ID del elemento que estamos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //Obtener un inflador
        val inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.pelicula_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.imgTest)
        var tv_name: TextView = vista.findViewById(R.id.tv_movie_name)
        var tv_duration: TextView = vista.findViewById(R.id.duration)

        var pelicula: Pelicula = listaPeliculas[p0]

        iv_img.setImageResource(pelicula.img)
        tv_name.setText(pelicula.nombre)
        tv_duration.setText(pelicula.duracion)

        vista.setOnClickListener {
            val intent: Intent = Intent(contexto, Movie_description::class.java )
            intent.putExtra("Nombre", pelicula.nombre)
            intent.putExtra("Sinopsis", pelicula.sinopsis)
            intent.putExtra("Duración", pelicula.duracion)
            intent.putExtra("Img", pelicula.img)
            contexto.startActivity(intent)

        }

        return vista



    }

}