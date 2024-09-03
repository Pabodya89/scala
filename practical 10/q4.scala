object BankApp2 extends App {
    val account1 = new Account1(500)
    val account2 = new Account1(-200)
    val account3 = new Account1(300)
    val account4 = new Account1(-50)

    val bank = new Bank1(List(account1, account2, account3, account4))

    println("Accounts with negative balance:")
    bank.accountsWithNegativeBalance().foreach(println)

    println(s"\nTotal balance in the bank: ${bank.totalBalance()}")

    println("\nApplying interest to all accounts...")
    bank.applyInterestToAll()

    println("\nFinal balances after applying interest:")
    bank.displayAccounts()
}




class Account1(var balance: Double) {
 
    def deposit(amount: Double): Unit = {
        if (amount > 0) balance += amount
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && amount <= balance) balance -= amount
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount)
            toAccount.deposit(amount)
        }
    }

    def getBalance(): Double = balance

    def applyInterest(): Unit = {
        if (balance > 0) {
            balance += balance * 0.05  
        } else {
            balance += balance * 0.10  
        }
    }

    override def toString: String = s"Account(balance: ${balance})"
}

class Bank1(var accounts: List[Account1]) {

    def accountsWithNegativeBalance(): List[Account1] = {
        accounts.filter(_.getBalance() < 0)
    }

    def totalBalance(): Double = {
        accounts.map(_.getBalance()).sum
    }

    def applyInterestToAll(): Unit = {
        accounts.foreach(_.applyInterest())
    }

    def displayAccounts(): Unit = {
        accounts.foreach(println)
    }
}


