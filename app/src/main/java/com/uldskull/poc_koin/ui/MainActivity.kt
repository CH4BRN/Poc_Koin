package com.uldskull.poc_koin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.uldskull.poc_koin.R
import com.uldskull.poc_koin.api.MySimplePresenter
import com.uldskull.poc_koin.domain.HelloRepository
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(btn_say_hello != null){
            btn_say_hello.setOnClickListener(View.OnClickListener {
                sayHello()
            })
        }

        if(btn_say_hi != null){
            btn_say_hi.setOnClickListener(View.OnClickListener {
                sayHi()
            })
        }


    }

    private fun sayHello(){
        Toast.makeText(this, firstPresenter.sayHello(), Toast.LENGTH_SHORT)
    }

    private fun sayHi(){
        Toast.makeText(this, firstPresenter.sayHi(), Toast.LENGTH_SHORT)
    }





    val firstPresenter: MySimplePresenter by inject()


}
