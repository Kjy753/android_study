package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_v_iew.*

class ListVIewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_v_iew)

        var car = ArrayList<Car>()
        for(i in 0 until 10){
            car.add(Car(""+i+"번째 자동차",""+i+"순위 엔진"))
        }

        val adapter = ListVIewAdapter(car, LayoutInflater.from(this@ListVIewActivity))
        listView.adapter =adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val carName = (adapter.getItem(position) as Car).name
            val carEngine = (adapter.getItem(position) as Car).engine

            Toast.makeText(this@ListVIewActivity,carName+""+carEngine,Toast.LENGTH_LONG).show()
        }

    }
}

class ListVIewAdapter(
   val car :ArrayList<Car>,
   val layoutInflater: LayoutInflater
 ): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View
        val holder : ViewHolder

        if(convertView == null){
            view = layoutInflater.inflate(R.layout.item_view,null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        holder.carName?.setText(car.get(position).name)
        holder.carEngine?.setText(car.get(position).engine)

        return view
    }

    override fun getItem(position: Int): Any {
        // 그리고자 하는 아이템 리스트중 하나 ( 포지션에 해당하는)
       return car.get(position)
    }

    override fun getItemId(position: Int): Long {
        // 해당 포지션에 위치해 있는 아이템뷰의 아이디 설정
        return position.toLong()
    }

    override fun getCount(): Int {
        // 그리고자 하는 아이템 리스트의 전체 갯수
        return car.size
    }
}

class ViewHolder{

    var carName : TextView? = null
    var carEngine :TextView? = null
}