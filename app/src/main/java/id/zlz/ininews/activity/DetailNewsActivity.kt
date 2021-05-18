package id.zlz.ininews.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.zlz.ininews.App
import id.zlz.ininews.R
import id.zlz.ininews.model.DataNews

class DetailNewsActivity : AppCompatActivity() {
    lateinit var list: DataNews
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)
        loadData()
    }


    fun loadData() {
        var titledetail = findViewById(R.id.tv_title_detailnews) as TextView
        val authordetail = findViewById(R.id.tv_author_detailnews) as TextView
        val datedetail = findViewById(R.id.tv_date_detailnews) as TextView
        val contentdetail = findViewById(R.id.tv_content_detailnews) as TextView
        val imagedetail = findViewById(R.id.iv_detailnews) as ImageView
        list = intent.getParcelableExtra(App.INTENT_LIST)!!
        title = list.title

        Glide.with(this).load(list.imagenews).into(imagedetail)
        titledetail.text = list.title
        authordetail.text = list.author
        datedetail.text = list.date
        contentdetail.text = list.content
    }

}