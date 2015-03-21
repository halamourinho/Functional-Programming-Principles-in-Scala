package funsets
import scala.{Nothing, Null}
object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
}