package id.zlz.ininews.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.R

class NewsViewHolderHorizontal(itemView: View): RecyclerView.ViewHolder(itemView) {
    val title = itemView.findViewById(R.id.tv_title_news_horizontal) as TextView
    val author = itemView.findViewById(R.id.tv_author_horizontal) as TextView
    val date = itemView.findViewById(R.id.tv_date_horizontal) as TextView
    val description = itemView.findViewById(R.id.tv_desc_horizontal) as TextView
    val img = itemView.findViewById(R.id.iv_item_horizontal) as ImageView
}