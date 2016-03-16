package day2

/**
 * Created by Yuki Katada on 3/15/16
 */
import scalaz.Scalaz._
import scalaz._

trait FunctorPractice {
  val a = List(1, 2, 3).fpair

  val b = Functor[List].lift { (_: Int) * 2 }
  val e = List(1, 2, 3).map { (_: Int) * 2 }
  val f = Functor[List].fpair(List(1, 2, 3))


}
