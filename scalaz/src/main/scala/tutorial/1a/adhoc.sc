trait Plus[A] {
  def plus(a1: A, a2: A): A
}

def plus[A: Plus](a1: A, a2: A): A = implicitly[Plus[A]].plus(a1, a2)

implicit object IntPlus extends Plus[Int]{
  def plus(a1: Int, a2: Int) = a1 + a2
}

plus(3, 5)