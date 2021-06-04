package id.zlz.ininews.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.zlz.ininews.R
import id.zlz.ininews.databinding.ItemNewsVerticalBinding
import id.zlz.ininews.model.DataNews

class NewsAdapterVertical(
    private val listvertical: ArrayList<DataNews>,
    val listSelection: ListSelectionNews
) :
    RecyclerView.Adapter<NewsViewHolderVertical>() {
    private lateinit var binding: ItemNewsVerticalBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolderVertical {
        val viewVertical: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news_vertical, parent, false)
        binding = ItemNewsVerticalBinding.bind(viewVertical)
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

        binding.vfavbutton.setOnCheckedChangeListener() {checkbox , isChecked ->
            if (isChecked){
                listSelection.onSave(listdata)
            }else{


            }
        }
    }

    override fun getItemCount() = listvertical.size

}