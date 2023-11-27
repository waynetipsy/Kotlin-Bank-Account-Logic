package com.example.bankaccountprogram

fun main () {
    val denisesBankAccount = BankAccount(
        "Denis Panjuta", 1554.10,
    )
      denisesBankAccount.deposit(2000.0)
    denisesBankAccount.withdraw(1000.0)
    denisesBankAccount.deposit(400.0)
    denisesBankAccount.withdraw(550.0)
    denisesBankAccount.displayTransactionHistory()
    println("${denisesBankAccount.accountHolder}'s balance is ${denisesBankAccount.balance}")
}