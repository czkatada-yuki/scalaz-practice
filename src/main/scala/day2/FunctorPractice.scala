package day2

/**
  * Created by Yuki Katada on 3/15/16
  */
import scalaz.Scalaz._
import scalaz._

class FunctorPractice {
  val a = List(1,2,3).fpair
  val b = Functor[List].lift { (_: Int) * 2}
}
