package br.edu.infnet.deslize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewPager()
    }

    private fun setUpViewPager(){
        // Em uma activity se passa supportFragmentManager
        // Se o ViewPager estiver dentro de um fragmento
        // você deve passar childFragmentManager para
        // exibir fragmentos dentro de um fragmento
        viewpager.adapter =
            DeslizePagerAdapter(supportFragmentManager)
        // TabLayout em conjunto com ViewPager
        tablayout.setupWithViewPager(viewpager)
    }
}
