package sph.hrt.misplantillas.tabSanti

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import sph.hrt.misplantillas.NavDrawer.OneFragment
import sph.hrt.misplantillas.NavDrawer.ThreeFragment
import sph.hrt.misplantillas.NavDrawer.TwoFragment

class VpAdapter(fragmetManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmetManager,lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{OneFragment()}
            1->{TwoFragment()}
            2->{ThreeFragment()}
            else->{OneFragment()}
        }

    }
}