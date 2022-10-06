package sph.hrt.misplantillas.NavDrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.databinding.ActivityMainBinding
import sph.hrt.misplantillas.databinding.ActivityNavDrawerBinding
import sph.hrt.misplantillas.helper.INavegation

class NavDrawerActivity : AppCompatActivity(), INavegation {
    lateinit var binding: ActivityNavDrawerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolContainer.toolbar2)



        binding.toolContainer.txtTitle.text = "One Fragment"

        binding.toolContainer.imgLogo.setOnClickListener {
            binding.root.openDrawer(GravityCompat.START)
        }


        with(  binding.NavView.menu){
            this.findItem(R.id.item1).setOnMenuItemClickListener {
                binding.root.closeDrawers()
                findNavigation(OneFragment.newInstance(),"One Fragment")
                return@setOnMenuItemClickListener true
            }
            this.findItem(R.id.item2).setOnMenuItemClickListener {
                binding.root.closeDrawers()
                findNavigation(TwoFragment.newInstance(),"Two Fragment")
                return@setOnMenuItemClickListener true
            }
            this.findItem(R.id.item3).setOnMenuItemClickListener {
                binding.root.closeDrawers()
                findNavigation(ThreeFragment.newInstance(),"Three Fragment")
                return@setOnMenuItemClickListener true
            }
        }
    }

    override fun findNavigation(fragment: Fragment, title: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView3, fragment)
            .commit()
        binding.toolContainer.txtTitle.text = title
    }
}