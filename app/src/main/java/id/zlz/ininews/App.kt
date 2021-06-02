package id.zlz.ininews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.Fragment
import com.bumptech.glide.manager.SupportRequestManagerFragment
import id.zlz.ininews.activity.AboutAppsActivity
import id.zlz.ininews.adapter.NewsAdapterHorizontal
import id.zlz.ininews.adapter.NewsAdapterVertical
import id.zlz.ininews.databinding.ActivityMainBinding
import id.zlz.ininews.fragments.FavouriteFragment
import id.zlz.ininews.fragments.NewsFragment
import id.zlz.ininews.model.DataNews
import id.zlz.ininews.model.IndoNews.listDataNews

class App : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFragment()

        binding.fab.setOnClickListener { view ->
            val intent = Intent(this, AboutAppsActivity::class.java)
            startActivity(intent)
        }

    }

    fun initFragment() {
        loadFragment(NewsFragment())
        binding.navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item_news -> {
                    loadFragment(NewsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_fav -> {
                    loadFragment(FavouriteFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }


    fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_home, fragment, fragment.javaClass.getSimpleName())
//        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }


}
