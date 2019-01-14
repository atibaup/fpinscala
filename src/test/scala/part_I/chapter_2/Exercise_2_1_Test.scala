package part_I.chapter_2

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_1_Test extends FlatSpec with Matchers {

    "A fibonacci implementation" should "equal 0 for n = 0" in {
        Exercise_2_1.fib(0) shouldBe 0
    }

    it should "equal 1 for n = 1" in {
        Exercise_2_1.fib(1) shouldBe 1
    }

    it should "validate fibonacci recursion" in {
        Exercise_2_1.fib(5) shouldBe (Exercise_2_1.fib(4) + Exercise_2_1.fib(3))
        Exercise_2_1.fib(35) shouldBe (Exercise_2_1.fib(34) + Exercise_2_1.fib(33))
    }
}
