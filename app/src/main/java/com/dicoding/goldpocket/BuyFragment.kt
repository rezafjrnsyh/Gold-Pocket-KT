package com.dicoding.goldpocket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dicoding.goldpocket.viewmodel.PocketViewModel
import kotlinx.android.synthetic.main.fragment_buy.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [BuyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

//var balance: Int = 0
class BuyFragment() : Fragment() {

    lateinit var pocketViewModel: PocketViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // old
//        pocketViewModel = ViewModelProviders.of(requireActivity()).get(PocketViewModel::class.java)
        //newest
        pocketViewModel = ViewModelProvider(requireActivity()).get(PocketViewModel::class.java)
        return inflater.inflate(R.layout.fragment_buy, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val observerViewModel = Observer<Int> { newValue ->
            print(newValue)
            // Update the UI, in this case, a TextView
            balanceNumber.text = newValue.toString()
        }

        pocketViewModel.balance.observe(viewLifecycleOwner, observerViewModel)
//        balanceNumber.text = pocketViewModel.balance.toString()
    }

//    fun updateBalaceView(balance: Int) {
//        this.balance = balance
//        balanceNumber?.text = this.balance.toString()
//    }
}