package sph.hrt.misplantillas.helper

import androidx.fragment.app.Fragment
import sph.hrt.misplantillas.basicActivity.FirstFragment

interface INavegation {

    fun findNavigation(fragment: Fragment,title:String = "")
}