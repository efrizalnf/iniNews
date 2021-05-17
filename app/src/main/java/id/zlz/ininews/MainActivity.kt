package id.zlz.ininews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.adapter.NewsAdapterHorizontal
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews.listNewsData

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<DataNews> = arrayListOf()
    lateinit var recyclerViewHorizontal: RecyclerView
    val filtertopnews = listNewsData.filterIndexed { index, s -> index % 2 == 0 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerViewHorizontal()
    }

    fun initRecyclerViewHorizontal() {
        recyclerViewHorizontal = findViewById(R.id.rv_horizontal)
        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = NewsAdapterHorizontal(list)
        recyclerViewHorizontal.setHasFixedSize(true)
        list.addAll(filtertopnews)
    }
}