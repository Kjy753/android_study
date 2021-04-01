package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab_pager.*
import kotlinx.android.synthetic.main.activity_tab_pager.tab_layout
import kotlinx.android.synthetic.main.activity_tab_pager2.*

class TabPager2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager2)

        tab_layout.addTab(tab_layout.newTab().setText("one"))
        tab_layout.addTab(tab_layout.newTab().setText("two"))
        tab_layout.addTab(tab_layout.newTab().setText("three"))

        val adapter = ThreePageAdapter(LayoutInflater.from(this@TabPager2Activity))

        view_pager2.adapter = adapter


        tab_layout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager2.currentItem = tab!!.position
            }
        })
        view_pager2.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
    }


}

class ThreePageAdapter(
    val layoutInflater: LayoutInflater
): PagerAdapter(){
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        // 지금 화면에 나온 오브젝트가 내가 만든게 맞는지 물어보는 것
        return view === `object` as View
    }

    override fun getCount(): Int {
        //카운터
        return 3;
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        // 페이지가 가려질떄 호출
        container.removeView(`object` as View)

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // 실제적으로 뷰를 그려주는 함수

        when(position){
            0->{
                val view = layoutInflater.inflate(R.layout.fragment_one,container,false)
                container.addView(view)
                return view
            }
            1->{
                val view = layoutInflater.inflate(R.layout.fragment_two,container,false)
                container.addView(view)
                return view
            }
            2->{
                val view = layoutInflater.inflate(R.layout.fragment_three,container,false)
                container.addView(view)
                return view
            }
            else->{
                val view = layoutInflater.inflate(R.layout.fragment_one,container,false)
                container.addView(view)
                return view
            }
        }
    }
}