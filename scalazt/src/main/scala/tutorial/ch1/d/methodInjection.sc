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
}

//

def plus[A : Monoid](a: A, b: A): A = implicitly[Monoid[A]].mappend(a, b)

plus(3, 4)

plus("arr", 4.toString)

trait MonoidOp[A] {
  val F: Monoid[A]
  def value: A
  def |+| (a2: A) = F.mappend(value, a2)
}

implicit def toMonoidOp[A: Monoid](a: A): MonoidOp[A] = new MonoidOp[A] {
  val F = implicitly[Monoid[A]]
  val value = a
}

3 |+| 4

"a" |+| "b"

