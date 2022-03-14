package mendivil.orlando.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Movie_description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_description)

        val tv_titulo: TextView = findViewById(R.id.tView_Title)
        val tv_sinopsis: TextView = findViewById(R.id.tView_description)
        val imgView_imgPeli: ImageView = findViewById(R.id.imgView_Img)
        val tv_duracion: TextView = findViewById(R.id.tView_movieDuration)

        val bundle = intent.extras

        if (bundle!=null){
            var titulo: String = bundle.getString("Nombre", "")
            var sinopsis: String = bundle.getString("Sinopsis", "")
            var imgPeli: Int = bundle.getInt("Img")
            var duracion: String = bundle.getString("Duración", "")

            tv_titulo.setText(titulo)
            tv_sinopsis.setText(sinopsis)
            imgView_imgPeli.setImageResource(imgPeli)
            tv_duracion.setText(duracion)
        }
    }
}