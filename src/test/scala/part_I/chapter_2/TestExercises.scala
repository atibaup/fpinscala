package part_I.chapter_2

import org.scalatest.{FlatSpec, Matchers}

class TestExercises extends FlatSpec with Matchers {

    "A fibonacci implementation" should "equal 0 for n = 0" in {
        Exercises.fib_v2(0) shouldBe 0
    }

    it should "equal 1 for n = 1" in {
        Exercises.fib_v2(1) shouldBe 1
    }

    it should "validate fibonacci recursion" in {
        Exercises.fib_v2(5) shouldBe (Exercises.fib(4) + Exercises.fib(3))
        Exercises.fib_v2(35) shouldBe (Exercises.fib(34) + Exercises.fib(33))
    }

    val order = (a: Int, b:Int) => a < b

    "An isSorted implementation" should "equal true for an empty Array" in {
        Exercises.isSorted(Array.empty[Int], order) shouldBe true
    }

    it should "be true for an array of size 1" in {
        Exercises.isSorted(Array(1), order) shouldBe true
    }

    it should "be true for an ordered array of size 2" in {
        Exercises.isSorted(Array(1, 2), order) shouldBe true
    }

    it should "be false for an unordered array of size 2" in {
        Exercises.isSorted(Array(2, 1), order) shouldBe false
    }
}
