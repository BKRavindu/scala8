object InterestCalculator {
  def calculateInterest: Double => Double = depositAmount => {
    depositAmount match {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 250000
    val interestAmount = calculateInterest(depositAmount)
    println(s"For a deposit of Rs. $depositAmount, the interest earned in a year is Rs. $interestAmount")
  }
}
