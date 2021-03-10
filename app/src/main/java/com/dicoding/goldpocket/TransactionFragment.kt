package com.dicoding.goldpocket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dicoding.goldpocket.viewmodel.PocketViewModel
import kotlinx.android.synthetic.main.fragment_transaction.*

/**
 * A simple [Fragment] subclass.
 * Use the [TransactionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TransactionFragment(var transactionHandler: TransactionHandler? = null) : Fragment() {


    lateinit var pocketViewModel: PocketViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        // old
//        pocketViewModel = ViewModelProviders.of(requireActivity()).get(PocketViewModel::class.java)
        //newest
        pocketViewModel = ViewModelProvider(requireActivity()).get(PocketViewModel::class.java)
        return inflater.inflate(R.layout.fragment_transaction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buy.setOnClickListener(clickListener)
        sell.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view -> when(view.id) {
            R.id.buy -> {
//                (activity as MainActivity).handleBuy(inputTrx.text.toString().toInt())
                pocketViewModel.handleIncrement(inputTrx.text.toString().toInt())
                inputTrx.setText("")
            }
            R.id.sell -> {
//                (activity as MainActivity).handleSell(inputTrx.text.toString().toInt())
                pocketViewModel.handleDecrement(inputTrx.text.toString().toInt())
                inputTrx.setText("")
            }
        }
    }
}