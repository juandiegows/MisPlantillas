package sph.hrt.misplantillas.basicActivity

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.databinding.ActivityBasicBinding
import sph.hrt.misplantillas.databinding.ActivityBasicBinding.*
import sph.hrt.misplantillas.databinding.FragmentSecondBinding
import sph.hrt.misplantillas.helper.INavegation
import sph.hrt.misplantillas.helper.Singleton

class BasicActivity : AppCompatActivity(), INavegation {
    lateinit var binding: ActivityBasicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
       }

    override fun onStart() {
        findNavigation(FirstFragment.newInstance("", ""), "First Fragment")

        super.onStart()
    }
    override fun findNavigation(fragment: Fragment, title: String) {


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
        setTitle("   $title")
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setIcon((getDrawable(R.drawable.ic_baseline_4k_24)))
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
    }
}