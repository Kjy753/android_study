package com.kjy753.second_project

import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab_pager.*

class TabPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)

        tab_layout.addTab(tab_layout.newTab().setText("one"))
        tab_layout.addTab(tab_layout.newTab().setText("two"))
        tab_layout.addTab(tab_layout.newTab().setText("three"))

        val PagerAdapter = PagerAdapter(supportFragmentManager,3)
        view_pager.adapter = PagerAdapter

        tab_layout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem = tab!!.position
            }
        })
        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        // -> 페이저가 이동했을떄 탭을 이동시키는 코드
    }
}

class PagerAdapter(fragmentManager: FragmentManager,val tabCount :Int) :FragmentStatePagerAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> {
                return Fragment1()
            }
            1-> {
                return Fragment2()
            }
            2-> {
                return Fragment3()
            }
            else -> return Fragment1()
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}