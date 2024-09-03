object BankApp extends App {
    val account1 = new Account(500)
    val account2 = new Account(300)

    account1.deposit(200)  
    account1.withdraw(100)  

    account1.transfer(150, account2)  

    println(s"Account 1 balance: ${account1.getBalance()}")
    println(s"Account 2 balance: ${account2.getBalance()}")
}


class Account(var balance: Double) {
    
    def deposit(amount: Double): Unit = {
        if (amount > 0) {
            balance += amount
            println(s"Deposited :- ${amount}. New balance:- ${balance}")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println(s"Withdrew ${amount}. New balance: ${balance}")
        } else if (amount > balance) {
            println("Not enough balance.")
        } else {
            println("Withdraw amount must be positive.")
        }
    }
 
    def transfer(amount: Double, toAccount: Account): Unit = {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount)  
            toAccount.deposit(amount)  
            println(s"Transferred ${amount} to the given account.")
        } else if (amount > balance) {
            println("Insufficient balance to transfer.")
        } else {
            println("Transfer amount must be positive.")
        }
    }

        def getBalance(): Double = balance
}

