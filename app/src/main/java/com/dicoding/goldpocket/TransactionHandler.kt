package com.dicoding.goldpocket

interface TransactionHandler {

    fun handleBuy(Stock: Int)
    fun handleSell(Stock: Int)
}