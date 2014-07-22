//def plus[A](a1: A, a2: A): A = ???

trait Plus[A] {
  def plus(a2: A): A
}

def plus[A <: Plus[A]](a1: A, a2: A): A = a1.plus(a2)

case class IntPlus(a1: Int) extends Plus[IntPlus] {
  def plus(a2: IntPlus) = IntPlus(a1 + a2.a1)
}

plus(IntPlus(3), IntPlus(5))
