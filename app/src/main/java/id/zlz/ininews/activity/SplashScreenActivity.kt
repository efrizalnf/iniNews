package id.zlz.ininews.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import id.zlz.ininews.MainActivity
import id.zlz.ininews.R


class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Looper.myLooper()?.let {
            Handler(it).postDelayed(Runnable {
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_TIME_OUT)
        }
    }
}