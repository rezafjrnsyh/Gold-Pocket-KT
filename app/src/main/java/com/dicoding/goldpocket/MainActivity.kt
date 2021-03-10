    package com.dicoding.goldpocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

    // , TransactionHandler
    class MainActivity : AppCompatActivity() {

    // Since java version, must be use lateinit
//    lateinit var nameText: TextView

    private var counter: Int = 0
    lateinit var buyFragment: BuyFragment
    lateinit var transactionFragment: TransactionFragment
    var balance = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initOnClickListener()
        initFragment()
        // must be set id view in xml
//        nameText = findViewById(R.id.nameTextView)
//        nameText.text = "Reza Fajriansyah"
    }

        private fun initOnClickListener() {
//            btnInc.setOnClickListener(clickListener)
//            btnDec.setOnClickListener(clickListener)
//            btnReset.setOnClickListener(clickListener)
//            btnBuy.setOnClickListener(clickListener)
            btnBuyFG.setOnClickListener(clickListener)
            btnTrxFG.setOnClickListener(clickListener)
            history.setOnClickListener(clickListener)
        }

        private fun initFragment() {
            buyFragment = BuyFragment()
            transactionFragment = TransactionFragment() //this
        }

        private val clickListener = View.OnClickListener { view -> when(view.id) {
//                R.id.btnInc -> increment()
//                R.id.btnDec -> decrement()
//                R.id.btnReset -> reset()
//                R.id.btnBuy -> moveBuyPage()
                R.id.btnBuyFG -> fragment(buyFragment)
                R.id.btnTrxFG -> fragment(transactionFragment)
                R.id.history -> startActivity(Intent(this, SplitActivity::class.java ))
            }
        }

        private fun fragment(fragment: Fragment) {
            val fragmentManager = supportFragmentManager.beginTransaction()
            fragmentManager.replace(R.id.fragmentContainer, fragment).commit()
        }

//        override fun handleBuy(stock: Int) {
//            this.balance = balance + stock
//            buyFragment.updateBalaceView(balance)
//        }
//
//        override fun handleSell(stock: Int) {
//            this.balance = balance - stock
//            buyFragment.updateBalaceView(balance)
//        }

        private fun moveBuyPage() {
            val intent = Intent(this, BuyPage::class.java)
            startActivity(intent)
        }

        private fun reset() {
            counter = 0
            updateViewCounter()
        }
        private fun increment() {
            counter++
            updateViewCounter()
        }

        private fun decrement() {
            counter--
            updateViewCounter()
        }

        private fun updateViewCounter() {
//            numb.text = counter.toString()
        }


    }