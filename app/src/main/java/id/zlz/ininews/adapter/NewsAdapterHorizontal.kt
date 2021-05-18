package id.zlz.ininews.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.zlz.ininews.R
import id.zlz.ininews.model.DataNews

class NewsAdapterHorizontal(private val listNews: ArrayList<DataNews>) :
    RecyclerView.Adapter<NewsViewHolderHorizontal>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolderHorizontal {
        val view:View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news_horizontal, parent, false)
        return NewsViewHolderHorizontal(view)
    }

    override fun onBindViewHolder(holderHorizontal: NewsViewHolderHorizontal, position: Int) {
        val listData = listNews[position]
        Glide.with(holderHorizontal.itemView.context)
            .load(listData.imagenews)
            .apply(RequestOptions().centerCrop())
            .into(holderHorizontal.img)
        holderHorizontal.title.text = listData.title
        holderHorizontal.author.text = listData.author
        holderHorizontal.date.text = listData.date
        holderHorizontal.description.text = listData.desc

    }

    override fun getItemCount() = listNews.size

}