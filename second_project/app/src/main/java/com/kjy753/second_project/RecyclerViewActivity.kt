package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import kotlinx.android.synthetic.main.activity_recycler_view.*
import kotlin.math.log

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        Log.d("시작","시작")

        var car = ArrayList<recycler_Car>()
        for(i in 0 until 50){
            car.add(recycler_Car(""+i+"번째 자동차",""+i+"순위 엔진"))
        }

        val adapter = RecyclerViewAdapter(car, LayoutInflater.from(this@RecyclerViewActivity))
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
//        recycler_view.layoutManager = GridLayoutManager(this@RecyclerViewActivity,2)

    }
}

class RecyclerViewAdapter(
    val itemList:ArrayList<recycler_Car>,
    val inflater : LayoutInflater
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val carName: TextView
        val carEngine : TextView
        init{
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
            itemView.setOnClickListener {

                val position : Int =adapterPosition     // adapterPosition position값을 다른곳에서도 찾게 도와준다.
                val engineName = itemList.get(position).engine
                Log.d("engine","1"+engineName)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.carName.setText(itemList.get(position).name)
     holder.carEngine.setText(itemList.get(position).engine)
    }
}

class recycler_Car(val name:String, val engine: String){

}