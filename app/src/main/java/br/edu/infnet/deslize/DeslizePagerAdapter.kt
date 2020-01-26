package br.edu.infnet.deslize


import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class DeslizePagerAdapter(fm: FragmentManager):
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val numeroDeFragmentos = 2
    // lista de títulos para as abas
    val titulos = listOf("Texto", "Imagem")

    // retorna o fragmento adequado ao índice
    override fun getItem(position: Int) = when(position){
        0 -> TextFragment()
        else -> ImageFragment()
    }

    // retorna o total de fragmentos
    override fun getCount() = numeroDeFragmentos

    // retorna o título adequado à aba do índice
    override fun getPageTitle(position: Int)
            = titulos[position]
}