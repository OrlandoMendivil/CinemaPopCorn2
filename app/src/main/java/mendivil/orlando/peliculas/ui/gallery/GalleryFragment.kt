package mendivil.orlando.peliculas.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mendivil.orlando.peliculas.AdaptadorSeries
import mendivil.orlando.peliculas.R
import mendivil.orlando.peliculas.Serie
import mendivil.orlando.peliculas.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    var series: ArrayList<Serie> = ArrayList()
    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textGallery
        //galleryViewModel.text.observe(viewLifecycleOwner) {
        //    textView.text = it
        //}
        llenar_peliculas()
        val adaptador = AdaptadorSeries(root.context, series)

        val listview: ListView = binding.listViewSeries

        listview.adapter = adaptador
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenar_peliculas(){
        val serie1 = Serie(1, getString(R.string.tituloSerie1), getString(R.string.bojackHorseman_desc), R.drawable.bojackhorseman)
        series.add(serie1)

        val serie2 = Serie(2, getString(R.string.tituloSerie2), getString(R.string.breakingBad_desc), R.drawable.breakingbad)
        series.add(serie2)

        val serie3 = Serie(3, getString(R.string.tituloSerie3), getString(R.string.brooklyn99_desc), R.drawable.brooklyn99)
        series.add(serie3)

        val serie4 = Serie(4, getString(R.string.tituloSerie4), getString(R.string.squidgame_desc), R.drawable.squidgame)
        series.add(serie4)

        val serie5 = Serie(5, getString(R.string.tituloSerie5), getString(R.string.supernatural_desc), R.drawable.supernatural)
        series.add(serie5)
    }
}