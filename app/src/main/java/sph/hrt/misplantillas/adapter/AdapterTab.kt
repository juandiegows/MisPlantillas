package sph.hrt.misplantillas.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterTab(suporFra: FragmentManager) : FragmentPagerAdapter(
    suporFra,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    var fragments = ArrayList<Fragment>()
    var titles = ArrayList<String>()
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles.get(position)
    }

}