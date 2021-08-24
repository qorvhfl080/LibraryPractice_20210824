package com.nepplus.librarypractice_20210824

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermissionActivity
import com.gun0912.tedpermission.TedPermissionBase
import com.gun0912.tedpermission.provider.TedPermissionProvider
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
//            TedPermission 라이브러리 활용 -> 권한 여부 대응 + 실제 체크
            val pl = object : PermissionListener {
                override fun onPermissionGranted() {
//                    권한 승인되었을때 실행할 코드 
//                    전화 연결 (CALL) 활용
                    val myUri = Uri.parse("tel:010-0000-0000")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
//                    권한이 없을때 실행할 코드
                    Toast.makeText(mContext, "권한이 없어서 전화할 수 업습니다.", Toast.LENGTH_SHORT).show()
                }
            }

//            실제로 권한 확인 : Manifest에도 적어두고 + 코틀린에서도 확인
//            라이브러리 문제로 현재 작업 불가

        }
    }

    override fun setValues() {

    }

}