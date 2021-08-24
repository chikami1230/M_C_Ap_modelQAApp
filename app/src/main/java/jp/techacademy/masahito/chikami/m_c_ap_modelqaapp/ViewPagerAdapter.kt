package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal.*
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.powerful.Fragment2_1
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.powerful.Fragment2_2

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    val titleIds1 = listOf(
        R.string.tab_title_1, R.string.tab_title_2,R.string.tab_title_3, R.string.tab_title_4,
        R.string.tab_title_5, R.string.tab_title_6,R.string.tab_title_7, R.string.tab_title_8,
        R.string.tab_title_9, R.string.tab_title_10,R.string.tab_title_11, R.string.tab_title_12,
        R.string.tab_title_13, R.string.tab_title_14)

    val titleIds2 = listOf(
        R.string.tab_title_1, R.string.tab_title_2,R.string.tab_title_3, R.string.tab_title_4,
        R.string.tab_title_5, R.string.tab_title_6,R.string.tab_title_7, R.string.tab_title_8,
        R.string.tab_title_9, R.string.tab_title_10)

    val fragments1 = listOf(
        Fragment1_1(),
        Fragment1_2(),
        Fragment1_3(),
        Fragment1_4(),
        Fragment1_5(),
        Fragment1_6(),
        Fragment1_7(),
        Fragment1_8(),
        Fragment1_9(),
        Fragment1_10(),
        Fragment1_11(),
        Fragment1_12(),
        Fragment1_13(),
        Fragment1_14()
    )

    val fragments2 = listOf(
        Fragment2_1(),
        Fragment2_2()
    )

    override fun getItemCount(): Int {
        return fragments1.size
        return fragments2.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments1[position]
        return fragments2[position]
    }
}