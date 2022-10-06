package sph.hrt.misplantillas.bottomActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.databinding.ActivityBottomBinding
import sph.hrt.misplantillas.databinding.ActivityBottomBinding.*
import sph.hrt.misplantillas.helper.INavegation

class BottomActivity : AppCompatActivity(), INavegation {
    lateinit var binding: ActivityBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        setSupportActionBar(binding.toolbar)
        setTitle("One Fragment")
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon((getDrawable(R.drawable.ic_baseline_4k_24)))


        binding.bottomNavigationView.menu.findItem(R.id.item1).setOnMenuItemClickListener {
           findNavigation(OneFragment.newInstance(),"One Fragment")
            it.isChecked = true
            return@setOnMenuItemClickListener true
        }
        binding.bottomNavigationView.menu.findItem(R.id.item2).setOnMenuItemClickListener {
            findNavigation(TwoFragment.newInstance(),"Two Fragment")
            it.isChecked = true
            return@setOnMenuItemClickListener true
        }
        binding.bottomNavigationView.menu.findItem(R.id.item3).setOnMenuItemClickListener {
            findNavigation(ThreeFragment.newInstance(),"Three Fragment")
            it.isChecked = true
            return@setOnMenuItemClickListener false
        }
    }

    override fun findNavigation(fragment: Fragment, title: String) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2, fragment)
            .addToBackStack(null)
            .commit()
        supportFragmentManager.popBackStack()
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon((getDrawable(R.drawable.ic_baseline_4k_24)))
    }
}