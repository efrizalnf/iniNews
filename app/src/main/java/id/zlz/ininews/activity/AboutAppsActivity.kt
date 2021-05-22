package id.zlz.ininews.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.zlz.ininews.R

class AboutAppsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_apps)
        // my_child_toolbar is defined in the layout file
        setSupportActionBar(findViewById(R.id.my_toolbar))

        // Get a support ActionBar corresponding to this toolbar and enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


}