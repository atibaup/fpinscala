package part_I.chapter_2

/*
Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of
the previous two—the sequence begins 0, 1, 1, 2, 3, 5. Your definition should use
a local tail-recursive function.

def fib(n: Int): Int

 */
object Exercises {
  // 2.1
  def fib(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case n => fib(n - 1) + fib(n - 2)
    }
  }

  def fib_v2(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

  // 2.2
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def sortedSoFar(sorted: Boolean, left: Array[A]): Boolean = {
      if (!sorted) {
        false
      } else {
        if (left.size > 1) {
          val head = left.head
          val tail = left.tail
          sortedSoFar(ordered(head, tail.head), tail.tail)
        } else {
          true
        }
      }
    }
    sortedSoFar(true, as)
  }

  // 2.3
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    a: A => (b: B) => f(a, b)
  }

  // 2.4
  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  // 2.5
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    a: A => f(g(a))
  }

}
