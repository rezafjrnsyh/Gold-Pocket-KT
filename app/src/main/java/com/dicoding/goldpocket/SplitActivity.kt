package com.dicoding.goldpocket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_split.*
import kotlinx.android.synthetic.main.fragment_buy.*
import kotlinx.android.synthetic.main.fragment_transaction.*
//, TransactionHandler
class SplitActivity : AppCompatActivity(){

    lateinit var buyFragment: BuyFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split)
        (fragment2 as TransactionFragment).transactionHandler
    }

//    override fun handleBuy(Stock: Int) {
//        this.balance = balance + Stock
//        (fragment as BuyFragment).updateBalaceView(this.balance)
//    }
//
//    override fun handleSell(Stock: Int) {
//        TODO("Not yet implemented")
//    }
}