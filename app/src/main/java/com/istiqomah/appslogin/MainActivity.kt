package com.istiqomah.appslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
        //deklarasi button intent(variabel intent)
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //deklarasi id button dari main activity
        btnIntent = findViewById(R.id.btnIntent)
        //set untuk memindahkan halaman setelah button di klik
        btnIntent.setOnClickListener(this)
    }
    //fungsi yg dihasilkan dari perintah setonclicklistener
    override fun onClick(v: View) {
        //switch case ke halaman berikutnya
        when(v.id){
            //ketika switch case yg diklik sama dengan btn intent maka lanjut
             // halaman selanjutnya
            R.id.btnIntent ->{
                //deklarasi btn intent
                //penyebutan parameter main activity sebelumnya ke parameter newactivity2
                val intentBiasa = Intent(this@MainActivity,newActivity2::class.java)
               //perintah untuk menjalankan btn intent dari button yg di klik
                startActivity(intentBiasa)
            }
        }
    }
}