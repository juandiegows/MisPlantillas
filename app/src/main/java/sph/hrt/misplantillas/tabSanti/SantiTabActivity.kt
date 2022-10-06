package sph.hrt.misplantillas.tabSanti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import sph.hrt.misplantillas.R
import sph.hrt.misplantillas.databinding.ActivitySantiTabBinding

class SantiTabActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySantiTabBinding
    val list = mutableListOf("1","2","3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySantiTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setVp()

    }


    private fun setVp() {
        binding.tabLayoutSanti.adapter = VpAdapter(supportFragmentManager, lifecycle)
        binding.tabLayoutSanti.orientation = ViewPager2.ORIENTATION_HORIZONTAL
       TabLayoutMediator(binding.tabLayoutSanti1,binding.tabLayoutSanti){tab,position->
           tab.text = list[position]
       }.attach()
    }

}