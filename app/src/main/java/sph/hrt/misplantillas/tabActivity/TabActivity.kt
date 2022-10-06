package sph.hrt.misplantillas.tabActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import sph.hrt.misplantillas.NavDrawer.OneFragment
import sph.hrt.misplantillas.NavDrawer.ThreeFragment
import sph.hrt.misplantillas.NavDrawer.TwoFragment
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.adapter.AdapterTab
import sph.hrt.misplantillas.databinding.ActivityTabBinding
import sph.hrt.misplantillas.helper.INavegation

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar4)
        var adapterTab = AdapterTab(supportFragmentManager)
        adapterTab.fragments.add(OneFragment.newInstance())
        adapterTab.titles.add("One")
        adapterTab.fragments.add(TwoFragment.newInstance())
        adapterTab.titles.add("Two")
        adapterTab.fragments.add(ThreeFragment.newInstance())
        adapterTab.titles.add("Three")
        binding.fragmentContainerView5.adapter = adapterTab
        binding.tabLayout.setupWithViewPager(binding.fragmentContainerView5)
        with(binding.tabLayout){
            this.getTabAt(0)!!.icon = getDrawable(R.drawable.ic_baseline_looks_one_24)
            this.getTabAt(1)!!.icon = getDrawable(R.drawable.ic_baseline_looks_two_24)
            this.getTabAt(2)!!.icon = getDrawable(R.drawable.ic_baseline_looks_3_24)
        }

    }


}