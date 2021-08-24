package com.nepplus.librarypractice_20210824

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        profileImg.setOnClickListener {
//            프로필 사진 클릭 이벤트 -> 사진 크게 보기 화면으로 이동
            val myIntent = Intent(mContext, ViewPhotoActivity::class.java)
            startActivity(myIntent)
        }

        callBtn.setOnClickListener {
//            전화 연결 (CALL) 활용
            val myUri = Uri.parse("tel:010-0000-0000")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }
    }

    override fun setValues() {

    }

}