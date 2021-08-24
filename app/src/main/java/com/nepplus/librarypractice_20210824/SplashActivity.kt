package com.nepplus.librarypractice_20210824

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        val loadingHandler = Handler(Looper.getMainLooper())
        loadingHandler.postDelayed( {
            val intent = Intent(mContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }

    override fun setValues() {

    }
}