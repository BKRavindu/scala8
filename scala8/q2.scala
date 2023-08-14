import scala.io.StdIn

object NumberClassifier {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = StdIn.readInt()
    Number(input)
  }

  def Number: Int => Unit = num => {
    val value = num match {
      case n if n < 0 => "Negative"
      case 0 => "Zero"
      case n if n % 2 == 0 => "Even"
      case _ => "Odd"
    }

    println(s"The input number $num is: $value")
  }
}
