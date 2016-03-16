package day3

import scalaz.Scalaz._
import scalaz._

/**
  * Created by Yuki Katada on 3/16/16
  */
trait TagPractice {
  sealed trait KiloGram
  def KiloGram[A](a: A): A @@ KiloGram = Tag[A, KiloGram](a)
  sealed trait JoulePerKiloGram
}
