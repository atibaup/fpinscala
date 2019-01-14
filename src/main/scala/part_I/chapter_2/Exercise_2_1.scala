package part_I.chapter_2

/*
Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of
the previous two—the sequence begins 0, 1, 1, 2, 3, 5. Your definition should use
a local tail-recursive function.

def fib(n: Int): Int

 */
object Exercise_2_1 {
  def fib(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case n => fib(n - 1) + fib(n - 2)
    }
  }
}
