object q1 {
  private val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  private def filterEvenNumbers(numbers : List[Int]) : List[Int] = {
    numbers.filter(_ % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    println(filterEvenNumbers(input))
  }
}
