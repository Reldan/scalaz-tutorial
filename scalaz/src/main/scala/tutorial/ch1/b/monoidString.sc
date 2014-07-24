1
trait Monoid[A] {
  def mappend(a1: A, a2: A): A
  def mzero: A
}
object Monoid {
  implicit val IntMonoid: Monoid[Int] = new Monoid[Int] {
    def mappend(a: Int, b: Int): Int = a + b
    def mzero: Int = 0
  }
  implicit val StringMonoid: Monoid[String] = new Monoid[String] {
    def mappend(a: String, b: String): String = a + b
    def mzero: String = ""
  }
  implicit val AnyMonoid: Monoid[Any] = new Monoid[Any] {
    def mappend(a: Any, b: Any): Any = a.toString + b.toString
    def mzero: Any = ""
  }
}
def sum[A: Monoid](xs: List[A]): A = {
  val m = implicitly[Monoid[A]]
  xs.foldLeft(m.mzero)(m.mappend)
}

sum(List("a", "b", "c"))
sum(List(1, 2, 3))
sum(List(1, 2, "3"))

val multiMonoid: Monoid[Int] = new Monoid[Int] {
  def mappend(a: Int, b: Int): Int = a * b
  def mzero: Int = 1
}

sum(List(1, 2, 3, 3))(multiMonoid)