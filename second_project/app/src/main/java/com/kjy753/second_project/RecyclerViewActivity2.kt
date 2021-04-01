package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view2.*

class RecyclerViewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view2)

        val subcarList = ArrayList<SubCar>()
        for(i in 0 until 50){
            subcarList.add(SubCar(""+i + "번쨰 자동차",""+i+"순위엔진"))
        }

        val adapter = Adapter(subcarList, LayoutInflater.from(this@RecyclerViewActivity2))
        panel.adapter = adapter
        panel.layoutManager = LinearLayoutManager(this@RecyclerViewActivity2)


    }
}


class Adapter(val itemList:ArrayList<SubCar>,val inflater: LayoutInflater) : RecyclerView.Adapter<Adapter.ViewHolder>(){

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val first : TextView
        val second : TextView

        init {
            first = itemView.findViewById(R.id.first)
            second = itemView.findViewById(R.id.second)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view2,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.first.setText(itemList.get(position).firstname)
        holder.second.setText(itemList.get(position).secondname)
    }
}

class SubCar(val firstname:String, val secondname: String){

}