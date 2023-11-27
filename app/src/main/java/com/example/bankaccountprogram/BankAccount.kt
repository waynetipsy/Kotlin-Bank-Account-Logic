package com.example.bankaccountprogram

class BankAccount (var accountHolder: String,
                   var balance: Double){

    private val transttionHistory = mutableListOf<String>()

    fun deposit (amount: Double) {
      balance += amount
        // balance = balance + amount
        transttionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw (amount: Double)  {
      if(amount <= balance) {
          // we can withdraw
          balance -= amount
          transttionHistory.add("$accountHolder withdrew \$$amount ")
      }else{
          //We cannot withdraw money
          println("You don't have the funds to withdraw $$amount")
      }
    }

    fun displayTransactionHistory () {
        println("Transaction history for $accountHolder")
       for (transaction in transttionHistory) {
           println(transaction)
       }
    }

}