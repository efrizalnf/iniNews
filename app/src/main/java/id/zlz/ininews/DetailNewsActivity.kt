package id.zlz.ininews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import id.zlz.ininews.model.DataNews

class DetailNewsActivity : AppCompatActivity() {
    lateinit var list: DataNews
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)
        var titledetail = findViewById(R.id.iv_detailnews) as ImageView
        val authordetail = findViewById(R.id.tv_author_detailnews) as TextView
        val datedetail = findViewById(R.id.tv_date_detailnews) as TextView
        val contentdetail = findViewById(R.id.tv_content_detailnews) as TextView
        list = intent.getParcelableExtra(MainActivity.INTENT_LIST)!!
        title = list.title

//        titledetail = list.title


    }


    fun loadData() {

    }

}