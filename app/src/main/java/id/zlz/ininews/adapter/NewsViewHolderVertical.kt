package id.zlz.ininews.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.zlz.ininews.R
import id.zlz.ininews.model.DataNews

class NewsViewHolderVertical(itview : View): RecyclerView.ViewHolder(itview) {
    val titlevertical = itview.findViewById(R.id.tv_title_news_vertical) as TextView
    val authorvertical = itview.findViewById(R.id.tv_author_vertical) as TextView
    val datevertical = itview.findViewById(R.id.tv_date_vertical) as TextView
    val descvertical = itview.findViewById(R.id.tv_desc_vertical) as TextView
    val imagevertical = itview.findViewById(R.id.iv_item_vertical) as ImageView
}