object q2 {
  val input: List[Int] = List(1, 2, 3, 4, 5)
  private def calculateSquare(numbers : List[Int]) : List[Int] = {
    numbers.map(num=> num*num)
  }

  def main(args: Array[String]): Unit = {
    println(calculateSquare(input))
  }
}
