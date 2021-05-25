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
import id.zlz.ininews.databinding.ActivityMainBinding
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews.listDataNews

class App : AppCompatActivity(), ListSelectionNews {
    private lateinit var binding: ActivityMainBinding
    private var listv: ArrayList<DataNews> = arrayListOf()
    private var listh: ArrayList<DataNews> = arrayListOf()
    val filtertopnews = listDataNews.filterIndexed { index, s -> index % 2 == 0 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerViewHorizontal()
        initRecyclerViewVertical()

        binding.fab.setOnClickListener { view ->
            val intent = Intent(this, AboutAppsActivity::class.java)
            startActivity(intent)
        }
    }

    fun initRecyclerViewHorizontal() {
        binding.rvHorizontal.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal.adapter = NewsAdapterHorizontal(listh, this)
        binding.rvHorizontal.setHasFixedSize(true)
        listh.addAll(filtertopnews)
    }

    fun initRecyclerViewVertical() {
        binding.rvVertical.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvVertical.adapter = NewsAdapterVertical(listv, this)
        binding.rvVertical.setHasFixedSize(true)
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
