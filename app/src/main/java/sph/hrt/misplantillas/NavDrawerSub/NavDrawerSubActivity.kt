package sph.hrt.misplantillas.NavDrawerSub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable
import androidx.fragment.app.Fragment
import sph.hrt.misplantillas.NavDrawer.OneFragment
import sph.hrt.misplantillas.NavDrawer.ThreeFragment
import sph.hrt.misplantillas.NavDrawer.TwoFragment
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.databinding.ActivityNavDrawerSubBinding
import sph.hrt.misplantillas.helper.INavegation

class NavDrawerSubActivity : AppCompatActivity(), INavegation {
    lateinit var binding: ActivityNavDrawerSubBinding
    lateinit var actionBar: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavDrawerSubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.include2.toolbar3)
        actionBar = ActionBarDrawerToggle(
            this,
            binding.include2.include.root,
            binding.include2.toolbar3,
            R.string.open,
            R.string.close
        ).apply {
            this.syncState()
        }
        binding.include2.include.root.addDrawerListener(
            actionBar
        )
        binding.include2.include.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    binding.include2.include.root.closeDrawers()

                    findNavigation(OneFragment(),"One Fragment")
                }
                R.id.item2 -> {
                    binding.include2.include.root.closeDrawers()

                    findNavigation(TwoFragment(),"Two Fragment")
                }
                R.id.item3 -> {
                    binding.include2.include.root.closeDrawers()
                    findNavigation(ThreeFragment(),"Three Fragment")
                }

            }
            true
        }
    }

    override fun findNavigation(fragment: Fragment, title: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView6, fragment)
            .commit()

        binding.include2.toolbar3.title = title
    }
}