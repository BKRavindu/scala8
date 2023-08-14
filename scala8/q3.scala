object word {

  def main(args: Array[String]): Unit = {

    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }

  val toUpper: String => String = word => word.toUpperCase()

  val toLower: String => String = word => word.toLowerCase()

  val formatNames: (String, Int) => String = (word, index) => {
    val wordChar = word.charAt(index)
    val modified = wordChar.toUpper
    word.patch(index, modified.toString, 1)
  }
}
