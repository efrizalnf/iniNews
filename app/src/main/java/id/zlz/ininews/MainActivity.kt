package id.zlz.ininews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.adapter.NewsAdapterHorizontal
import id.zlz.ininews.adapter.NewsAdapterVertical
import id.zlz.ininews.adapter.NewsViewHolderVertical
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews.listDataNews

class MainActivity : AppCompatActivity(), NewsAdapterVertical.ListSelectionNews {
    private var listv: ArrayList<DataNews> = arrayListOf()
    private var listh: ArrayList<DataNews> = arrayListOf()
    lateinit var recyclerView: RecyclerView
    val filtertopnews = listDataNews.filterIndexed { index, s -> index % 2 == 0 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerViewHorizontal()
        initRecyclerViewVertical()
    }

    fun initRecyclerViewHorizontal() {
        recyclerView = findViewById(R.id.rv_horizontal)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = NewsAdapterHorizontal(listh)
        recyclerView.setHasFixedSize(true)
        listh.addAll(filtertopnews)
    }

    fun initRecyclerViewVertical() {
        recyclerView = findViewById(R.id.rv_vertical)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = NewsAdapterVertical(listv, this)
        recyclerView.setHasFixedSize(true)
        listv.addAll(listDataNews)
    }


    override fun onClickItem(list: DataNews) {
        showDetailItemNews(list)
    }

    fun showDetailItemNews(item: DataNews) {
        val i = Intent(this, DetailNewsActivity::class.java)
        i.putExtra(INTENT_LIST, item)
    }

    companion object {
        const val INTENT_LIST = "item_news"
    }
}
