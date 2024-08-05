object q3 {
  val input : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  private def filterPrime(numbers : List[Int]) : List[Int] = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 until num).exists(n => num % n == 0)
    }
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    println(filterPrime(input))
  }

}
