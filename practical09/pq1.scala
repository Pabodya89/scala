def checkPoliya(diposit_amount : Double) : Double = {
     diposit_amount match 
        case amount if amount <= 20000.00 => amount * 0.02;
        case amount if amount <= 200000.00 => amount * 0.04;
        case amount if amount <= 2000000.00 => amount * 0.035;
        case _                            => diposit_amount * 0.065;

}
def invest(diposit_amount:Double) : Unit = {
    val deposit_Amount = diposit_amount;
    val interest = checkPoliya(deposit_Amount);
    println(s"The interest for $deposit_Amount is $interest ");
}