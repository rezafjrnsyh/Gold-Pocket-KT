package com.dicoding.goldpocket.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PocketViewModel: ViewModel() {

    var balance : MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun handleIncrement(stock: Int) {
        balance.postValue(balance.value?.plus(stock))
    }

    fun handleDecrement(stock: Int) {
//        this.balance = balance - stock
        balance.postValue(balance.value?.minus(stock))
    }
}