package id.zlz.ininews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.activity.AboutAppsActivity
import id.zlz.ininews.activity.DetailNewsActivity
import id.zlz.ininews.adapter.ListSelectionNews
import id.zlz.ininews.adapter.NewsAdapterHorizontal
import id.zlz.ininews.adapter.NewsAdapterVertical
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews.listDataNews

class App : AppCompatActivity(), ListSelectionNews {
    private var listv: ArrayList<DataNews> = arrayListOf()
    private var listh: ArrayList<DataNews> = arrayListOf()
    lateinit var recyclerView: RecyclerView
    val filtertopnews = listDataNews.filterIndexed { index, s -> index % 2 == 0 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerViewHorizontal()
        initRecyclerViewVertical()

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            val intent = Intent(this, AboutAppsActivity::class.java)
            startActivity(intent)
        }
    }

    fun initRecyclerViewHorizontal() {
        recyclerView = findViewById(R.id.rv_horizontal)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = NewsAdapterHorizontal(listh, this)
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
        startActivity(i)
    }

    companion object {
        const val INTENT_LIST = "item_news"
    }
}
