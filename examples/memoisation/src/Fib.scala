object FibMain extends App {
  def fib(n: Int): Int = if (n <= 2) 1 else fib(n - 1) + fib(n - 2)

  println(fib(5))
}