package com.dicoding.goldpocket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_buy_page.*

class BuyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_page)
        onClickListener()
    }

    fun onClickListener() {
        btnBack.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view -> when(view.id) {
            R.id.btnBack -> back()
        }
    }

    private fun back() {
        finish()
    }
}