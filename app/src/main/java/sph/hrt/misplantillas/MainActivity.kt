package sph.hrt.misplantillas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sph.hrt.misplantillas.FullScreen.FullActivity
import sph.hrt.misplantillas.NavDrawer.NavDrawerActivity
import sph.hrt.misplantillas.basicActivity.BasicActivity
import sph.hrt.misplantillas.bottomActivity.BottomActivity
import sph.hrt.misplantillas.databinding.ActivityMainBinding
import sph.hrt.misplantillas.tabActivity.TabActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toNavegation()
    }

    private fun toNavegation() {
        binding.btnBasicActivity.setOnClickListener {
            startActivity(Intent(this, BasicActivity::class.java))
        }
        binding.btnBottom.setOnClickListener {
            startActivity(Intent(this, BottomActivity::class.java))
        }
        binding.btnFullscreen.setOnClickListener {
            startActivity(Intent(this, FullActivity::class.java))
        }
        binding.btnNavDrawer.setOnClickListener {
            startActivity(Intent(this, NavDrawerActivity::class.java))
        }
        binding.btnTab.setOnClickListener {
            startActivity(Intent(this, TabActivity::class.java))
        }
    }
}