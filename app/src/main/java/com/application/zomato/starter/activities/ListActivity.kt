package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.Restaurant
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */

        var rests : List<Restaurant> = ArrayList();
        rests += Restaurant("name1", "address1", "desc1")
        rests += Restaurant("name2", "address2", "desc2")
        rests += Restaurant("name3", "address3", "desc3")
        rests += Restaurant("name4", "address4", "desc4")
        rests += Restaurant("name5", "address5", "desc5")
        rests += Restaurant("name6", "address6", "desc6")
        rests += Restaurant("name7", "address7", "desc7")
        rests += Restaurant("name8", "address8", "desc8")

        adapter.items = rests
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}