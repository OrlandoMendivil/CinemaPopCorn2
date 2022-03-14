package mendivil.orlando.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(this, peliculas)

        var listview: ListView = findViewById(R.id.movieList)

        listview.adapter = adaptador

    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.titulo1), getString(R.string.beeMovie_desc), "91 min", R.drawable.bee_movie)
        peliculas.add(pelicula1)

        val pelicula2 = Pelicula(2, getString(R.string.titulo2), getString(R.string.dondeEstanLasRubias_desc), "109 min", R.drawable.donde_estan_las_rubias_movie)
        peliculas.add(pelicula2)

        val pelicula3 = Pelicula(3, getString(R.string.titulo3), getString(R.string.kungFury_desc), "31 min", R.drawable.kung_fury_movie)
        peliculas.add(pelicula3)

        val pelicula4 = Pelicula(4, getString(R.string.titulo4), getString(R.string.megamente_desc), "96 min", R.drawable.megamente_movie)
        peliculas.add(pelicula4)

        val pelicula5 = Pelicula(5, getString(R.string.titulo5), getString(R.string.miVillanoFavorito_desc), "95 min", R.drawable.mi_villano_favorito_movie)
        peliculas.add(pelicula5)

        val pelicula6 = Pelicula(6, getString(R.string.titulo6), getString(R.string.monstersInc_desc), "96 min", R.drawable.monsters_inc_movie)
        peliculas.add(pelicula6)

        val pelicula7 = Pelicula(7, getString(R.string.titulo7), getString(R.string.shrek_desc), "90 min", R.drawable.shrek_movie)
        peliculas.add(pelicula7)

        val pelicula8 = Pelicula(8, getString(R.string.titulo8), getString(R.string.spiderman2_desc), "127 min", R.drawable.spiderman2_movie)
        peliculas.add(pelicula8)

        val pelicula9 = Pelicula(9, getString(R.string.titulo9), getString(R.string.toyStory_desc), "81 min", R.drawable.toy_story_movie)
        peliculas.add(pelicula9)
    }
}