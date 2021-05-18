package id.zlz.ininews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.zlz.ininews.R
import id.zlz.ininews.model.DataNews

class NewsAdapterVertical(private val listvertical : ArrayList<DataNews>, val listSelection:ListSelectionNews):
    RecyclerView.Adapter<NewsViewHolderVertical>() {

    interface ListSelectionNews{
        fun onClickItem(list: DataNews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolderVertical {
        val viewVertical : View = LayoutInflater.from(parent.context).inflate(R.layout.item_news_vertical, parent, false)
        return NewsViewHolderVertical(viewVertical)
    }

    override fun onBindViewHolder(holder: NewsViewHolderVertical, position: Int) {
        val listdata = listvertical[position]
        Glide.with(holder.itemView.context)
            .load(listdata.imagenews)
            .apply(RequestOptions().centerCrop())
            .into(holder.imagevertical)
        holder.titlevertical.text = listdata.title
        holder.authorvertical.text = listdata.author
        holder.datevertical.text = listdata.date
        holder.descvertical.text = listdata.desc

        holder.itemView.setOnClickListener {
            listSelection.onClickItem(listdata)
        }
    }

    override fun getItemCount()= listvertical.size

}