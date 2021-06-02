package id.zlz.ininews.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.R
import id.zlz.ininews.activity.DetailNewsActivity
import id.zlz.ininews.adapter.ListSelectionNews
import id.zlz.ininews.adapter.NewsAdapterHorizontal
import id.zlz.ininews.adapter.NewsAdapterVertical
import id.zlz.ininews.databinding.FragmentNewsBinding
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews
import id.zlz.ininews.room.NewsDb
import id.zlz.ininews.room.NewsEntities
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class NewsFragment : Fragment(), ListSelectionNews {
    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!
    private var listv: ArrayList<DataNews> = arrayListOf()
    private var listh: ArrayList<DataNews> = arrayListOf()
    val filtertopnews = IndoNews.listDataNews.filterIndexed { index, s -> index % 2 == 0 }
    val db by lazy { NewsDb(activity!!) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val view = binding.root
        initRecyclerViewHorizontal()
        initRecyclerViewVertical()
        return view
    }

    fun initRecyclerViewHorizontal() {
        binding.rvHorizontal.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal.adapter = NewsAdapterHorizontal(listh, this)
        binding.rvHorizontal.setHasFixedSize(true)
        listh.addAll(filtertopnews)
    }

    fun initRecyclerViewVertical() {
        binding.rvVertical.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvVertical.adapter = NewsAdapterVertical(listv, this)
        binding.rvVertical.setHasFixedSize(true)
        listv.addAll(IndoNews.listDataNews)
    }

    override fun onClickItem(list: DataNews) {
        showDetailItemNews(list)
    }

    override fun onSave(listdata: DataNews) {
        CoroutineScope(Dispatchers.IO).launch {
            db.newsDao().insertFav(
                NewsEntities(
                    0,
                    listdata.title.toString(),
                    listdata.author.toString(),
                    listdata.date.toString(),
                    listdata.desc.toString(),
                    listdata.content.toString(),
                    listdata.imagenews.toString()
                )
            )
        }
    }


    fun showDetailItemNews(item: DataNews) {
        val i = Intent(activity, DetailNewsActivity::class.java)
        i.putExtra(INTENT_LIST, item)
        startActivity(i)
    }

    companion object {
        const val INTENT_LIST = "item_news"
    }
}